SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "python39-smpplib-2.2.1-2.7.noarch.rpm"
RPM_HASH = "32f68ae71c4c6416fb305aa5eee799a2027783a296d1940bdf83a325fe5690d331bff8d99c91d8c38bfbee9e9c06339f7cd2baf70de436ab62e5209ca6b7044c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smpplib \
python39-smpplib \
python3dist-smpplib"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
