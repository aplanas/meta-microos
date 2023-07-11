SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-sat-stac-0.4.1-1.6.noarch.rpm"
RPM_HASH = "c6398aa473d10c39fbdb649b852e106faaf9eb10e19a8c4dc6b5abb2f8282d8ad135f552c448d5b8d0a4d392565845744f67c05fac65e911f35c2932c4251455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sat-stac \
python3.11dist-sat-stac \
python311-sat-stac \
python3dist-sat-stac"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-requests \
update-alternatives"

inherit rpm
