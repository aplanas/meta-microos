SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "python311-smpplib-2.2.1-2.5.noarch.rpm"
RPM_HASH = "dc30ef432f6905c24d9847eb864f8031b52c6a95acf92344f60ac9c86a432fe8cbf1ad6e6f3f52886b0d0b10c17469f5be38270512cbb4f3aa8356dfa8197eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(smpplib) \
python311-smpplib \
python3dist(smpplib)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
