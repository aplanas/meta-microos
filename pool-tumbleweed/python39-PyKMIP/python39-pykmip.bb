SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-PyKMIP-0.10.0-7.5.noarch.rpm"
RPM_HASH = "c1c4b1ecca844bda4ac529679a84bb1c566f7a156e5196d85a9883b56bd16e47b865e6d8943a86d4e47f818c7b75031843210c6f84ea0c1bdedb38fcf69b0162"
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
