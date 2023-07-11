SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-sat-stac-0.4.1-1.6.noarch.rpm"
RPM_HASH = "4847f91091fb9e530e13e696caeb24f6c3b3af9a5ab2590a99c56056c9b2b5f6a88167edfa8e640d6d8479a9f88aaaee78b11dcf921f800f6b3c742e8eedc2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sat-stac \
python39-sat-stac \
python3dist-sat-stac"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-requests \
update-alternatives"

inherit rpm
