SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python39-google-api-core-2.11.0-1.4.noarch.rpm"
RPM_HASH = "75dcc8cd481218028dcfa874d382f311e086cbb643dcc9a243bd2b480e146299273f6ae1edbe1adcf0d340e88bd97049dcd49d1c1bd22c755526d9c51bb21d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-api-core) \
python39-google-api-core \
python3dist(google-api-core)"
RDEPENDS:${PN} += "python(abi) \
python39-google-auth \
python39-googleapis-common-protos \
python39-grpcio \
python39-grpcio-status \
python39-protobuf \
python39-pytz \
python39-requests \
python39-setuptools"

inherit rpm
