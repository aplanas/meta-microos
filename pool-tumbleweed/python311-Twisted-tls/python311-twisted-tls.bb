SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-tls-22.10.0-8.1.noarch.rpm"
RPM_HASH = "3b04b0b7cc8fd6f53de9aafd3c0be8afcf72195a5536d62e558ad24d9f808874256883a6e5d8f731115f17b4eef2d480c457a4aa1381f4737dfc016392fa72aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-tls \
python311-Twisted-tls"

RDEPENDS:${PN} += "python311-Twisted \
python311-idna \
python311-pyOpenSSL \
python311-service-identity"

inherit rpm
