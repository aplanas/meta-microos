SUMMARY = "J2EE Expression Language Implementation"
DESCRIPTION = "This project provides an implementation of the Expression Language (EL). \
The main goals are: \
 * Improves current implementation: bug fixes and performance improvements \
 * Provides API for use by other tools, such as Netbeans"
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-3.0.1~b08-1.18.noarch.rpm"
RPM_HASH = "141777147d234b18c1e45e7ad36c3101468b7df6122956d6a66bc5989d465263eaf26fca30fd210a2bab4c9557755dc630435e148ae0435ad01774f715a37fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el \
mvn-org.eclipse.jetty.orbit-com.sun.el \
mvn-org.eclipse.jetty.orbit-com.sun.el-pom- \
mvn-org.glassfish-javax.el \
mvn-org.glassfish-javax.el-impl \
mvn-org.glassfish-javax.el-impl-pom- \
mvn-org.glassfish-javax.el-pom- \
mvn-org.glassfish.web-javax.el \
mvn-org.glassfish.web-javax.el-pom- \
osgi-com.sun.el.javax.el"

RDEPENDS:${PN} += "glassfish-el-api \
java-headless \
javapackages-filesystem \
mvn-javax.el-javax.el-api"

inherit rpm
