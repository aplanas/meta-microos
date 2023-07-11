SUMMARY = "Module to compile Python 3.6+ code to Python 2.7+"
DESCRIPTION = "A module to compile Python 3.6+ code to Python 2.7+."
LICENSE = "MIT"

PV = "202107.1047"

RPM_NAME = "python39-lib3to6-202107.1047-2.6.noarch.rpm"
RPM_HASH = "4240ef79334fe2f9d3233874fb29feb38cb5296d0d339328b467be4f203a477cbfa74d7aedca5269a466600ba6a8010a2cab1dc7bdb5112625f08805b8b31edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lib3to6 \
python39-lib3to6 \
python3dist-lib3to6"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astor \
python39-click \
python39-typing \
python39-wheel \
update-alternatives"

inherit rpm
