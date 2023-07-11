SUMMARY = "Javadoc for velocity"
DESCRIPTION = "Velocity is a Java-based template engine. It permits anyone to use the \
simple yet powerful template language to reference objects defined in \
Java code. \
When Velocity is used for web development, Web designers can work in \
parallel with Java programmers to develop web sites according to the \
Model-View-Controller (MVC) model, meaning that web page designers can \
focus solely on creating a site that looks good, and programmers can \
focus solely on writing top-notch code. Velocity separates Java code \
from the web pages, making the web site more maintainable over the long \
run and providing a viable alternative to Java Server Pages (JSPs) or \
PHP. \
Velocity's capabilities reach well beyond the realm of web sites; for \
example, it can generate SQL and PostScript and XML (see Anakia for more \
information on XML transformations) from templates. It can be used \
either as a standalone utility for generating source code and reports, \
or as an integrated component of other systems. Velocity also provides \
template services for the Turbine web application framework. \
Velocity+Turbine provides a template service that will allow web \
applications to be developed according to a true MVC model."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "velocity-javadoc-1.7-11.7.noarch.rpm"
RPM_HASH = "fb6cd2aa4da01584f40a26a4afb34fc94e8f7f9626ba8edee19e55f80cd8055021d2bd17b595641d082cb150506953043a97293860f33eb4d1d2e96be231e107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velocity-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
