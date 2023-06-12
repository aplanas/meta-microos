SUMMARY = "Expression Language 3.0 API"
DESCRIPTION = "Expression Language 3.0 API."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0) & Apache-2.0"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-api-3.0.1~b08-1.18.noarch.rpm"
RPM_HASH = "ca2ca1ccf6d4eabcc30a5db54266818ef160e738422d5adaff2a6faf9265d22b6f0b2d27421d0238e073beb6ea06174e690110ed286bef1cf11a71d33bcaa94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el-api \
mvn(javax.el:el-api) \
mvn(javax.el:el-api:pom:) \
mvn(javax.el:javax.el-api) \
mvn(javax.el:javax.el-api:pom:) \
mvn(org.glassfish:javax.el-api) \
mvn(org.glassfish:javax.el-api:pom:) \
osgi(javax.el-api)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
