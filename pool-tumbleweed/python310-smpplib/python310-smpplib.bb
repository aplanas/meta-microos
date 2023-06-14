SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "python310-smpplib-2.2.1-2.5.noarch.rpm"
RPM_HASH = "3ec9946e4578da731ab66f54b9a3f8643bcb5d9c57865d405304979c631e355460a5d8950841963cc2d072b5b5bdd76bc4fae1a39e72a42fd883da2687974ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smpplib \
python3.10dist-smpplib \
python310-smpplib \
python3dist-smpplib"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
