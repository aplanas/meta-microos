SUMMARY = "Java-based template engine"
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

RPM_NAME = "velocity-1.7-11.7.noarch.rpm"
RPM_HASH = "6e5175798251d1ac896fe4356aa24d6feb47a9f2f1496027addce1d2c60cf0782f00b4eb3a60c2f7fc48a47e1a6a37667bdcff5c2f590fd187a16ddee93a8711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity \
mvn-org.apache.velocity-velocity-pom- \
mvn-velocity-velocity \
mvn-velocity-velocity-pom- \
osgi-org.apache.velocity \
velocity"

RDEPENDS:${PN} += "avalon-logkit \
commons-collections \
commons-lang \
java \
java-headless \
javapackages-filesystem \
jdom \
mvn-commons-collections-commons-collections \
mvn-commons-lang-commons-lang \
oro \
reload4j \
servletapi4 \
werken-xpath"

inherit rpm
