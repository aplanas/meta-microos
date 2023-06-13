SUMMARY = "Module to compile Python 3.6+ code to Python 2.7+"
DESCRIPTION = "A module to compile Python 3.6+ code to Python 2.7+."
LICENSE = "MIT"

PV = "202107.1047"

RPM_NAME = "python39-lib3to6-202107.1047-2.4.noarch.rpm"
RPM_HASH = "68d2dfc9c37cf22027d8d7b8d39e5a1b0f182a66ca6a3bbbcef4c70750a48b71d1caf4d4d29829d00bd48406226b9d9d118964cdca6443cda529d3ed441a0c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lib3to6) \
python39-lib3to6 \
python3dist(lib3to6)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-astor \
python39-click \
python39-typing \
python39-wheel \
update-alternatives"

inherit rpm
