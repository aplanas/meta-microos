SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.6.1"

RPM_NAME = "python310-poetry-core-1.6.1-1.3.noarch.rpm"
RPM_HASH = "4939f636b3ed2f6a3d13874bbe64a4fccc9058bd868688f1dc702c04c31becf5f3b233e1922ce6d0c6b62f38368edd0f0754a5c1d7588e7f73fd982a584cc843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-poetry-core \
python310-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
