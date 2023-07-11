SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.59.1"

RPM_NAME = "python311-googleapis-common-protos-1.59.1-2.1.noarch.rpm"
RPM_HASH = "add9344d76296d269d394a92812b99b1d3c656b6fac697edcc966f5f310df26d9dae6ed050f73536c472159c23e8dd587cc9bfa7c09254010b6136428abffed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-googleapis-common-protos \
python3.11dist-googleapis-common-protos \
python311-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python311-protobuf"

inherit rpm
