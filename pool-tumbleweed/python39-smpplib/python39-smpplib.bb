SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "python39-smpplib-2.2.1-2.5.noarch.rpm"
RPM_HASH = "2a513bce426502d9052b554be3032dfffbc0c4c88161fee0ed6ee79e3a1f362d7ac57c535af5b95195726654975b2a2329fb805b0200316cd10cd85ac2b609be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(smpplib) \
python39-smpplib \
python3dist(smpplib)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
