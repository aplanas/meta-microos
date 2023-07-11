SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python311-nodeenv-1.7.0-1.7.noarch.rpm"
RPM_HASH = "664a49d2066e9a21becb300169d6b501d6964662ab0d3f5bf3e847eac6d4a8fbdfc304ac2e545f3c70da33b215fc7a387a87bd89645bd584d6f746b031f85aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nodeenv \
python3.11dist-nodeenv \
python311-nodeenv \
python3dist-nodeenv"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
