SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "python310-smpplib-2.2.1-2.7.noarch.rpm"
RPM_HASH = "8397c494109c4c9ceee0f9f831cad66421f9689eef24881969737786a7491638159881048388e48c07542631dc3cb1b722cb36095c1977d000a5a4ba3f221b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-smpplib \
python310-smpplib \
python3dist-smpplib"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
