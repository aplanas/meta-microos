SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-msrest-0.7.1-1.4.noarch.rpm"
RPM_HASH = "f0c50f32b96e9b6f9170b1409a91b211770de32be036e2c1d652369a9aad97cc0a5f0e6fe3970277b121fa56e3ce5876c090ebf82fc9ef62c738e4451576ea9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msrest \
python310-msrest \
python3dist-msrest"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-certifi \
python310-isodate \
python310-requests \
python310-requests-oauthlib"

inherit rpm
