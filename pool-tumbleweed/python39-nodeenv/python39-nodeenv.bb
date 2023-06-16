SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python39-nodeenv-1.7.0-1.5.noarch.rpm"
RPM_HASH = "75691d4d2343524aff293dfca62b934e5f0b9cca2ca1d143bf8ab15da660c4c5f0c82e3fd21698e6074319c7a675a1cdb1b761f9c6236a3db803594dbc74cde2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nodeenv \
python39-nodeenv \
python3dist-nodeenv"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
