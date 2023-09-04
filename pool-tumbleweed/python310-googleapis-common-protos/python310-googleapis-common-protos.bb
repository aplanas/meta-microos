SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.60.0"

RPM_NAME = "python310-googleapis-common-protos-1.60.0-1.1.noarch.rpm"
RPM_HASH = "26c5f244e9a3736717f7002bd3f7d98a9388a6ab3d10f6143ffd116713c99f98e499e5ad9b471b80bedc4fe3d8c589b35c0ec9a3532b5c2814ff5d77ad64127c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-googleapis-common-protos \
python310-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python310-protobuf"

inherit rpm
