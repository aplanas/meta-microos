SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-PyKMIP-0.10.0-7.5.noarch.rpm"
RPM_HASH = "db637bac4b516c91745574135df833744f81f2ff3fb34840b4e07e0e7aacdee9e8a7d1136e5fe94f66e122a5758ea728c03d8080a30d8f23d95c99c51bffb873"
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
