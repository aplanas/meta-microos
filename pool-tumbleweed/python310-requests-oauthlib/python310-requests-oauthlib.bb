SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "python310-requests-oauthlib-1.3.1-3.3.noarch.rpm"
RPM_HASH = "db43782840ee334e7f898f123ac6fd51688cdb29de771eb493b162aa1d3ff9ff136f0abb33f8962ebccfcf38ef3117487f31d52db0d186af711c5fc1177eeff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-oauthlib \
python310-requests-oauthlib \
python3dist-requests-oauthlib"

RDEPENDS:${PN} += "python-abi \
python310-oauthlib \
python310-requests"

inherit rpm
