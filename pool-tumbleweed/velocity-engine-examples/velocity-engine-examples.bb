SUMMARY = "Apache Velocity Engine - Examples"
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
This package contains very simple examples to use Velocity."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "velocity-engine-examples-2.3-3.10.noarch.rpm"
RPM_HASH = "d1fd257363e2de5e465757a89f87cbab93dd08abf2c64ae6c2be6150b773417687f6369474df98756e391d7defe5c93b5a9c87c96347ba74cfe79ab49df73405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-engine-examples \
mvn-org.apache.velocity-velocity-engine-examples-pom- \
osgi-org.apache.velocity.engine-examples \
velocity-engine-examples"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.jdom-jdom"

inherit rpm
