SUMMARY = "Test framework for apache-commons-collections"
DESCRIPTION = "Test framework for apache-commons-collections."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-testframework-3.2.2-7.5.noarch.rpm"
RPM_HASH = "287facdd34fe17f0c357a1e6d692cee359221e9252b180f5537b4aee09c9d205bc1671a8578252ca975a76474ad38d91d4c0fdce8dea29e42888671878f55166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections-testframework \
mvn-commons-collections-commons-collections-testframework \
mvn-org.apache.commons-commons-collections-testframework"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
