SUMMARY = "Google API client core library"
DESCRIPTION = "Core Library for Google Client Libraries."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python311-google-api-core-2.11.0-1.4.noarch.rpm"
RPM_HASH = "11d4573efe51ad4790c7cefa9a74646984159d0feffd3baae6539f00ae4c8a2775f4dbabad3da271950b693d1808eac50cd9ccaad93c60ec32c63fe445c5d65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-api-core) \
python311-google-api-core \
python3dist(google-api-core)"
RDEPENDS:${PN} += "python(abi) \
python311-google-auth \
python311-googleapis-common-protos \
python311-grpcio \
python311-grpcio-status \
python311-protobuf \
python311-pytz \
python311-requests \
python311-setuptools"

inherit rpm
