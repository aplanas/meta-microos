SUMMARY = "XMvn API"
DESCRIPTION = "This package provides XMvn API module which contains public interface \
for functionality implemented by XMvn Core."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-api-4.2.0-4.1.noarch.rpm"
RPM_HASH = "7ce541e8f0103f8b4738049ca6dd63d54cbffa766462a82a7929a0b85443e4a1cc860c509fc4c980081a82de9b87051ea0b3156114543ed7e551bc2c1634ed13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-api-pom- \
xmvn-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
