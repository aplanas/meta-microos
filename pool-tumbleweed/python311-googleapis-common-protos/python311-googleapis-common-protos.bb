SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.59.0"

RPM_NAME = "python311-googleapis-common-protos-1.59.0-1.1.noarch.rpm"
RPM_HASH = "1afc4a1c7b709cba75c24ff84947dbb7b29131e0aa6edee6dd70ed4c3314b710a2de12f19a031acdd055aaf7ac72d63cb9a975cabec537fcb0d852243370fb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(googleapis-common-protos) \
python311-googleapis-common-protos \
python3dist(googleapis-common-protos)"

RDEPENDS:${PN} += "python(abi) \
python311-protobuf"

inherit rpm
