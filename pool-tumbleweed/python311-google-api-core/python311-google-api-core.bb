SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "python311-google-api-core-2.11.1-2.1.noarch.rpm"
RPM_HASH = "49f71726d8981defde3c727dccc71988f4b91ce552268553de915e249d080b843f3bb188cb2034c36c31b22f54c39d5338ae84acdcf0d9cacab1d10172fa7220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-api-core \
python3.11dist-google-api-core \
python311-google-api-core \
python3dist-google-api-core"

RDEPENDS:${PN} += "python-abi \
python311-google-auth \
python311-googleapis-common-protos \
python311-grpcio \
python311-grpcio-status \
python311-protobuf \
python311-pytz \
python311-requests \
python311-setuptools"

inherit rpm
