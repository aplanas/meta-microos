SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.6.1"

RPM_NAME = "python311-poetry-core-1.6.1-1.1.noarch.rpm"
RPM_HASH = "255e8064b6328793c1ed4031d65e25d2c8e289b3cdb86b04991fde08dc11a5c1a6c1bfccacc2e2ab61773b5b8c84d99ee37a5da26fb8651324ae822ee11e8f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(poetry-core) \
python311-poetry-core \
python3dist(poetry-core)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
