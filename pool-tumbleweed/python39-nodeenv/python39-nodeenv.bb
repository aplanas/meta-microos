SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python39-nodeenv-1.7.0-1.7.noarch.rpm"
RPM_HASH = "be68026fbfa1b168fbb4ad5fc3afa9b0ab010b33432e833cdd2ce5f731460f59b3cd5ff9dd885e32ebe08432e013ffa401e2470837cf51e644a13e00923e21cd"
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
