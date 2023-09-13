SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-PyKMIP-0.10.0-8.1.noarch.rpm"
RPM_HASH = "f0a8f8b8416dd13963e81a411e6645dcb470214763b94a967a1a8c5e46e3f56059570f1330c02da18f80bfa1a6b4a2f9afb8a2194b974832b1357b8cf4c57f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyKMIP \
python3.11dist-pykmip \
python311-PyKMIP \
python3dist-pykmip"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-SQLAlchemy \
python311-cryptography \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
