SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.60.0"

RPM_NAME = "python311-googleapis-common-protos-1.60.0-1.1.noarch.rpm"
RPM_HASH = "d10fc5e9740c61833335459b523b8754154ee672dbe3fbae06ec6f65b256bfa1e27274d8e2ae6ea5444a0d3ec0c3a817eb56bfdcd87c7b3903ac33fed4fa2e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-googleapis-common-protos \
python3.11dist-googleapis-common-protos \
python311-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python311-protobuf"

inherit rpm
