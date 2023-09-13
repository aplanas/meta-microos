SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-tls-22.10.0-8.1.noarch.rpm"
RPM_HASH = "62b218df20c47a6e4e2596985e059a635ced814f2b9e713abe55912d0434b18fafa8f3a91afefd1ebf2318a4f5b1ff86d3b6c1c4a6e8acbce0d23d50a4f865fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-tls"

RDEPENDS:${PN} += "python310-Twisted \
python310-idna \
python310-pyOpenSSL \
python310-service-identity"

inherit rpm
