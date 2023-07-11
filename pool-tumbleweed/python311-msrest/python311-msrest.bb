SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-msrest-0.7.1-1.4.noarch.rpm"
RPM_HASH = "b7525e3cc2bd27e2300820d300b030e68794ebeed97b18b62e52484f8fbfde504e00b1750ceed6066b21491bca0fd96cd764d9342e9c5a3247ae33c9cca36afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msrest \
python3.11dist-msrest \
python311-msrest \
python3dist-msrest"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-certifi \
python311-isodate \
python311-requests \
python311-requests-oauthlib"

inherit rpm
