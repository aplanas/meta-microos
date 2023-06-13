SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-tls-22.10.0-6.1.noarch.rpm"
RPM_HASH = "2e54a0bded36cf5120126a6f6858895b4281056f874d3c4f14cde397512ae35d30f089016004f53aae5db4e87711e9098c6b7719bb9e64527982bb4c06ae4ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-tls"

RDEPENDS:${PN} += "python39-Twisted \
python39-idna \
python39-pyOpenSSL \
python39-service_identity"

inherit rpm
