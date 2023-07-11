SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-PyKMIP-0.10.0-7.5.noarch.rpm"
RPM_HASH = "06e7a572a7af7533b077f0ffd119e867eb93b9dfefa0c64022d68561cd9ff07ea6a0aa7430d877f78ef1aa3b44afe1884d3601b037162d599a7a110435243a54"
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
