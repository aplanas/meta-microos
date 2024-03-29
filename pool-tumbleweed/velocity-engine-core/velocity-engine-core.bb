SUMMARY = "Apache Velocity - Engine"
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
applications to be developed according to a true MVC model."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "velocity-engine-core-2.3-3.10.noarch.rpm"
RPM_HASH = "93d0d1c08e3c2eb3b56bd42ba19be5af823828b1e928ff38483939b2439c9eed9c100e1180e9d2dd682b14d3fbcfda789e514e8d07132ef8b8b2115645cb6a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-engine-core \
mvn-org.apache.velocity-velocity-engine-core-pom- \
osgi-org.apache.velocity.engine-core \
velocity-engine-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3 \
mvn-org.slf4j-slf4j-api"

inherit rpm
