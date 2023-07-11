SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "python310-google-api-core-2.11.1-2.1.noarch.rpm"
RPM_HASH = "c45dfc6d62a64d41e76aad0896833fa4cd921015c44908e7fb30f1fa3545a8608b63d26f6681724b6b20e5f93392b4d833b9f301c69997546bc05b5eed7e5d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-api-core \
python310-google-api-core \
python3dist-google-api-core"

RDEPENDS:${PN} += "python-abi \
python310-google-auth \
python310-googleapis-common-protos \
python310-grpcio \
python310-grpcio-status \
python310-protobuf \
python310-pytz \
python310-requests \
python310-setuptools"

inherit rpm
