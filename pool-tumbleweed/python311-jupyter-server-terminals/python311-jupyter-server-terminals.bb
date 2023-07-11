SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-jupyter-server-terminals-0.4.4-1.5.noarch.rpm"
RPM_HASH = "7e09ef6e9182b85dc01b51a4405d2d2a4e2dd67f465daf07ec661fcc9a0c96ae7d46df248a68f05f1f34a3f315356643679713a71e4278e93055d57a55dc7c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-terminals \
python3.11dist-jupyter-server-terminals \
python311-jupyter-server-terminals \
python3dist-jupyter-server-terminals"

RDEPENDS:${PN} += "jupyter-server-terminals \
python-abi \
python311-terminado"

inherit rpm
