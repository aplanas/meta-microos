SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.6.1"

RPM_NAME = "python310-poetry-core-1.6.1-1.1.noarch.rpm"
RPM_HASH = "aa1a9d3d0165b5eb46727c4655efb5d2a6a2963feafb40d195f8c0935b3952caad6fddbfefda2481121d4616931053dd3dec411c3634aafd4cc1724c03026728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-core \
python3.10dist-poetry-core \
python310-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
