SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-pyls-spyder-0.4.0-1.9.noarch.rpm"
RPM_HASH = "0aa8e4b1293ef9c6585c992fdb640d52abe4edf7067d21031b932cafd4b193e27a55741987ca4e2d1e21cf1949e7ff998a53cba94fca6b6d047440a604a06db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyls-spyder \
python39-pyls-spyder \
python3dist-pyls-spyder"

RDEPENDS:${PN} += "python-abi \
python39-python-lsp-server"

inherit rpm
