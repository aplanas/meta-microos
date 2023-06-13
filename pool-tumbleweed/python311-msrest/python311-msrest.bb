SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-msrest-0.7.1-1.3.noarch.rpm"
RPM_HASH = "087663f3fd97107bcb64094e14c48120d2a47106b7a8150a739ea93183203d1fb39d02f8faab1942ec620cad4d85d0c42c0c0a2fc44074e6d33e840c4cfd8251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msrest) \
python311-msrest \
python3dist(msrest)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-certifi \
python311-isodate \
python311-requests \
python311-requests-oauthlib"

inherit rpm
