SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.60.0"

RPM_NAME = "python39-googleapis-common-protos-1.60.0-1.1.noarch.rpm"
RPM_HASH = "9d5d2a2c79eb47dafe5207c6fc0bb7fdd0f7fab2596009dde4d5ed9071d57aaeb9f29871f1b316abcd72b49f88c7ee7a27f5714e6bbc609bda5b57d1f9d422b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-googleapis-common-protos \
python39-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python39-protobuf"

inherit rpm
