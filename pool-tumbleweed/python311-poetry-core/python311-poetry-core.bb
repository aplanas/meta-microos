SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.6.1"

RPM_NAME = "python311-poetry-core-1.6.1-1.3.noarch.rpm"
RPM_HASH = "a2c1b6c61866c82e140414d1bbbf733ec947021fe6ac1083bac48ed0c60fa4fc49979e471cb3039c5233dd81933c34d853848955514c8aba5566f2ac486d5a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-core \
python3.11dist-poetry-core \
python311-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
