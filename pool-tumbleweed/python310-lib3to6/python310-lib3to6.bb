SUMMARY = "Module to compile Python 3.6+ code to Python 2.7+"
DESCRIPTION = "A module to compile Python 3.6+ code to Python 2.7+."
LICENSE = "MIT"

PV = "202107.1047"

RPM_NAME = "python310-lib3to6-202107.1047-2.6.noarch.rpm"
RPM_HASH = "6a4f30b47e42e21aa134b8d35683302443fef1b3898ad05034a90d7de6804edff4e5f2abb7c637121b17455a66bedeb439695c6a89cfb70d40e3da59a56a28a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lib3to6 \
python310-lib3to6 \
python3dist-lib3to6"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astor \
python310-click \
python310-typing \
python310-wheel \
update-alternatives"

inherit rpm
