SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "1.6.1"

RPM_NAME = "python39-poetry-core-1.6.1-1.3.noarch.rpm"
RPM_HASH = "35765b3b5632dbbcfcb98f32b964a6e8b5d1544e4d125ded17e8095cb99fcb7e94818ef986d029efed6da77b2139c1d12696b4689a61e3f02eeaff9fd50757e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-poetry-core \
python39-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
