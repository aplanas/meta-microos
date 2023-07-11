SUMMARY = "Module to compile Python 3.6+ code to Python 2.7+"
DESCRIPTION = "A module to compile Python 3.6+ code to Python 2.7+."
LICENSE = "MIT"

PV = "202107.1047"

RPM_NAME = "python311-lib3to6-202107.1047-2.6.noarch.rpm"
RPM_HASH = "d498ae52467fe9a72387d27878abe68014d94b2dcbe542c4d3da64fba3e6052380db04cf2e40cabe564e5a86a1654523ca6855d96a1683d23b2fdaf7c70ceb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lib3to6 \
python3.11dist-lib3to6 \
python311-lib3to6 \
python3dist-lib3to6"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-astor \
python311-click \
python311-typing \
python311-wheel \
update-alternatives"

inherit rpm
