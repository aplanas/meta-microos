SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-PyKMIP-0.10.0-7.3.noarch.rpm"
RPM_HASH = "2765407d8195c5ce51404d479a0143ada0ccd734f8fa1d4092c7db7ec3df51f188caab264990c5fd7405b4ed94e52f7c825e0e8f82acde68e00a1ae04f3c2911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pykmip) \
python311-PyKMIP \
python3dist(pykmip)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-SQLAlchemy \
python311-cryptography \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
