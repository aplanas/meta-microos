SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-PyKMIP-0.10.0-7.3.noarch.rpm"
RPM_HASH = "298a9ae6c574781d4579eb2593e75c42b8ec199274e1d9876564337c2664f2a6d21177031b3711f9b1d82ae618f768ba46b588955432fcdfeae3152a9cb9e519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyKMIP \
python3.10dist-pykmip \
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
