SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "python310-requests-oauthlib-1.3.1-3.1.noarch.rpm"
RPM_HASH = "3b206ca8f1f64f6b7093f27ce09fbb73ad0a8b1ee842b95466980deda354bc04ce319ec66a4f7e50851755b5ae705246200795fef86abfd6c81d985bc50a35af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-oauthlib \
python3.10dist-requests-oauthlib \
python310-requests-oauthlib \
python3dist-requests-oauthlib"

RDEPENDS:${PN} += "python-abi \
python310-oauthlib \
python310-requests"

inherit rpm
