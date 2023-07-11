SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-sat-stac-0.4.1-1.6.noarch.rpm"
RPM_HASH = "2c87b46c7ce229cfe2d9a43bfb37ce7e069e7511cf6e5b26894c33fadef5b05b2c336f3405fef3614878fe42348f44656f011e846ce0d306ebf80d5f446b53a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sat-stac \
python310-sat-stac \
python3dist-sat-stac"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-requests \
update-alternatives"

inherit rpm
