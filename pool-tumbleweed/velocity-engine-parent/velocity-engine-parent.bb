SUMMARY = "Apache Velocity - Engine parent pom"
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
This packages contains a parent pom needed for maven build"
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "velocity-engine-parent-2.3-3.10.noarch.rpm"
RPM_HASH = "bcfc604d68b2fb407a6c850885b86ab4c26f17ae9b85330e106adfad3c20fd99c0045f444deef528bd2e0a6197039d7963ccae2c07a60fb93d620ec0206a5efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-engine-parent-pom- \
velocity-engine-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-javadoc-plugin \
mvn-org.apache.velocity-velocity-master-pom-"

inherit rpm
