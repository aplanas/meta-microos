SUMMARY = "Expression Language 3.0 API"
DESCRIPTION = "Expression Language 3.0 API."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0) & Apache-2.0"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-api-3.0.1~b08-1.19.noarch.rpm"
RPM_HASH = "c2b3070425b398218763502d61b305d6defc08b6f637c3f3f84be460e377419876b10dd8c1dd85972779ce2f6dfe0a0577eaa325b3ff922f7ee252296bd0cc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el-api \
mvn-javax.el-el-api \
mvn-javax.el-el-api-pom- \
mvn-javax.el-javax.el-api \
mvn-javax.el-javax.el-api-pom- \
mvn-org.glassfish-javax.el-api \
mvn-org.glassfish-javax.el-api-pom- \
osgi-javax.el-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
