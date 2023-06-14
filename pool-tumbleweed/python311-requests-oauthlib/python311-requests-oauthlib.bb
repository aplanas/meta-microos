SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "python311-requests-oauthlib-1.3.1-3.1.noarch.rpm"
RPM_HASH = "a1da42f3b29b1c508cad20137e69526f65372b724a75a01be0f60003bc138a5efd9665545d898bbc6333c6368a030b99ad1ef70a3150e1fe8a684e197285e46f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requests-oauthlib \
python311-requests-oauthlib \
python3dist-requests-oauthlib"

RDEPENDS:${PN} += "python-abi \
python311-oauthlib \
python311-requests"

inherit rpm
