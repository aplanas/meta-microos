SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python310-google-api-core-2.11.0-1.4.noarch.rpm"
RPM_HASH = "3c2a4a825f5081ab8d04df3673221a2781c1f9759d995e9e5a938ef4b5bbd647410789414c43293ca8ed70b318932b5a7eb283663048046e6806b4778e16188c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-api-core \
python3.10dist(google-api-core) \
python310-google-api-core \
python3dist(google-api-core)"

RDEPENDS:${PN} += "python(abi) \
python310-google-auth \
python310-googleapis-common-protos \
python310-grpcio \
python310-grpcio-status \
python310-protobuf \
python310-pytz \
python310-requests \
python310-setuptools"

inherit rpm
