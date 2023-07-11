SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "python39-google-api-core-2.11.1-2.1.noarch.rpm"
RPM_HASH = "39f075b7312d6a472ecb6c7582e80cef370708d8eaac89e7125bc4636c05dc134a03df661e748e4d09b2565f597c47254246ab9c5b72d630cf061bea5c73e7b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-api-core \
python39-google-api-core \
python3dist-google-api-core"

RDEPENDS:${PN} += "python-abi \
python39-google-auth \
python39-googleapis-common-protos \
python39-grpcio \
python39-grpcio-status \
python39-protobuf \
python39-pytz \
python39-requests \
python39-setuptools"

inherit rpm
