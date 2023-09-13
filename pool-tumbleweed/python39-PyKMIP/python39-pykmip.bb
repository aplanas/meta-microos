SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-PyKMIP-0.10.0-8.1.noarch.rpm"
RPM_HASH = "5e6b3c4bd93657fbb8cf974ecddc9bde2635e7489ab4c737e2c65d4b825e0243da3db587c42886a8de3bebd41490849a6aa30a1b84bce96c3d5bb2a2f62f6bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pykmip \
python39-PyKMIP \
python3dist-pykmip"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-SQLAlchemy \
python39-cryptography \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
