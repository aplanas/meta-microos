SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-sat-stac-0.4.1-1.4.noarch.rpm"
RPM_HASH = "c0e7496b973cbabcef85cf5efc80a7b772d80ddca107fca2b40c2be5efb1e1d5f30e3625622babcf9da0f15df075c4d4822517f92870e7d35952b5bf782e6b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sat-stac \
python3.10dist-sat-stac \
python310-sat-stac \
python3dist-sat-stac"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-requests \
update-alternatives"

inherit rpm
