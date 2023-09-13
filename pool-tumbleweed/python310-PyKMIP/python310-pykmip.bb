SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-PyKMIP-0.10.0-8.1.noarch.rpm"
RPM_HASH = "53c494719f52b0ed9a1c5a9b668960e40034ad0b5a58a392f0495da821e64cc13ed50572b61d340b54b2d861fe158b03c03b23f8e0d7c5412ddb94f48cb04697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pykmip \
python310-PyKMIP \
python3dist-pykmip"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-SQLAlchemy \
python310-cryptography \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
