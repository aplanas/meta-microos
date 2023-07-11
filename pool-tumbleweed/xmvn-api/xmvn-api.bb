SUMMARY = "XMvn API"
DESCRIPTION = "This package provides XMvn API module which contains public interface \
for functionality implemented by XMvn Core."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-api-4.2.0-2.2.noarch.rpm"
RPM_HASH = "cd14655c9b3dc8ed8d1b13d7b094739ab5e2251db94171445066818f22b9d9bd0ce502686157a98eb6a63fa7aca8ddd888b65653fe913b9dfffcc7cf492d8513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-api-pom- \
xmvn-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
