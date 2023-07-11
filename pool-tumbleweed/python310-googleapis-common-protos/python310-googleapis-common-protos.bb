SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.59.1"

RPM_NAME = "python310-googleapis-common-protos-1.59.1-2.1.noarch.rpm"
RPM_HASH = "a3c7a3481512dc7fad2722c3ec41b352a8cee9b66fdc3f1f179373ebc905274b8bac6e47dc1496bbd0ce1a31d826fc4859a06dc60fbaf1a57df4fca5cdc8e466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-googleapis-common-protos \
python310-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python310-protobuf"

inherit rpm
