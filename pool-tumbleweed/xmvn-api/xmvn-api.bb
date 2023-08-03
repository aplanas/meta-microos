SUMMARY = "XMvn API"
DESCRIPTION = "This package provides XMvn API module which contains public interface \
for functionality implemented by XMvn Core."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-api-4.2.0-3.1.noarch.rpm"
RPM_HASH = "23624b1887fa000045d79782a8d38c88ec47500ed78391d0923f744718a7ba968b80f8a90b345e06f3a2d649976fda789af45ed033939dfda86bd0012b8366c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-api-pom- \
xmvn-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
