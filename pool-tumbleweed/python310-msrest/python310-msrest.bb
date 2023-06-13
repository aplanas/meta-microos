SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-msrest-0.7.1-1.3.noarch.rpm"
RPM_HASH = "ccace02c64cb461e65739bb70c5baaa223fe99038bc5394030d70db095522a1f898c90fd8bf68ca5b6e545ab575612be7b2efc60a3405a44e98c22f0304ed8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msrest \
python3.10dist(msrest) \
python310-msrest \
python3dist(msrest)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-certifi \
python310-isodate \
python310-requests \
python310-requests-oauthlib"

inherit rpm
