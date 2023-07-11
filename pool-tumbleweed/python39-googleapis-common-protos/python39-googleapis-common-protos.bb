SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.59.1"

RPM_NAME = "python39-googleapis-common-protos-1.59.1-2.1.noarch.rpm"
RPM_HASH = "d2099e5a0ff4c245cf640684af818cfbfdea5a9236a1faa0245c4148d7e744354f3fe83d693449518d91491878db6a32c450874a53fcf55797426ce8ef7d2b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-googleapis-common-protos \
python39-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python39-protobuf"

inherit rpm
