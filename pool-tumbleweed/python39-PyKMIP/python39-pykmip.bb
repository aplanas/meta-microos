SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-PyKMIP-0.10.0-7.3.noarch.rpm"
RPM_HASH = "41fbae3b93aa363fe96a5973e0020f2c2028ba7a9ad021e684d5b31ad46d849df2b8393b1739928690ca0501bcbb0c9b3487fab28987036c95bca6b1db78007b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pykmip) \
python39-PyKMIP \
python3dist(pykmip)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-SQLAlchemy \
python39-cryptography \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
