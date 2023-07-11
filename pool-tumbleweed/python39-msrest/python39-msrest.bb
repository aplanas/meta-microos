SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-msrest-0.7.1-1.4.noarch.rpm"
RPM_HASH = "56ff9493ce4a85c440fdcac07b7e94adf1605008420fea5d04bf1f56a812b9d0cb55b6e19c5441490dfb5f317a7f42e84317dad47a5cafa7054520264f028655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msrest \
python39-msrest \
python3dist-msrest"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-certifi \
python39-isodate \
python39-requests \
python39-requests-oauthlib"

inherit rpm
