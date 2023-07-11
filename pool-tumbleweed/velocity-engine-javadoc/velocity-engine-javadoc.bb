SUMMARY = "Javadoc for velocity-engine"
DESCRIPTION = " \
Velocity is a Java-based template engine. It permits anyone to use the \
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
applications to be developed according to a true MVC model. \
 \
This package contains Javadoc documentation"
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "velocity-engine-javadoc-2.3-3.10.noarch.rpm"
RPM_HASH = "b30bfa6f03b1fb2b5096a1d1626f0472ca8a9ce33e88af9556e512d301696f5ff649ad7e2a901c91d8b6c80aaf2ebdfad93946eb1c135db38b9ae3539a3eefa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velocity-engine-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
