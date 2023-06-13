SUMMARY = "Istack-commons test"
DESCRIPTION = "This package contains istack-commons test."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-test-3.0.7-4.4.noarch.rpm"
RPM_HASH = "03cccd74f83cfc67844f02a9b78444a6984b58ab6977a7f1ec191c70694c1012917a7c7687d0703dba3c5e4223a59e031b964758ddfdb88e04bf34c5f77df379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-test \
mvn(com.sun.istack:istack-commons-test) \
mvn(com.sun.istack:istack-commons-test:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(dom4j:dom4j) \
mvn(junit:junit) \
mvn(org.apache.ant:ant-junit)"

inherit rpm
