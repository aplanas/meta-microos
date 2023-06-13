SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-pyls-spyder-0.4.0-1.7.noarch.rpm"
RPM_HASH = "946acdfd380478eba655f630673b3500911fa1a2f05756fe22d0142a104c88ebf04b54604d9b420a30f111515222d89b75ef450b1b3277e25a9bf757c1ff71a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyls-spyder \
python3.10dist(pyls-spyder) \
python310-pyls-spyder \
python3dist(pyls-spyder)"

RDEPENDS:${PN} += "python(abi) \
python310-python-lsp-server"

inherit rpm
