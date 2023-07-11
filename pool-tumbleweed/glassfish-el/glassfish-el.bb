SUMMARY = "J2EE Expression Language Implementation"
DESCRIPTION = "This project provides an implementation of the Expression Language (EL). \
The main goals are: \
 * Improves current implementation: bug fixes and performance improvements \
 * Provides API for use by other tools, such as Netbeans"
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-3.0.1~b08-1.19.noarch.rpm"
RPM_HASH = "a4ecd072ce8755b2913641b756bfd590a77594ccdc22c1d654541681e99b7e306157f3061d76260d567e3d0d344a7c33fe7a8be641ca3241a80884c7005123b8"
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
