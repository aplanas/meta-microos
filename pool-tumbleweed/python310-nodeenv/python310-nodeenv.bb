SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python310-nodeenv-1.7.0-1.5.noarch.rpm"
RPM_HASH = "934d416f6a6c73a35e78b5ffe03415dbdb754b6d6857b531b0158bc07e5321fcc6edfe242942aa5c542f633b4c433d3a50a6d8327f4e7b7ff77d2f312a44482d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nodeenv \
python3.10dist-nodeenv \
python310-nodeenv \
python3dist-nodeenv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
