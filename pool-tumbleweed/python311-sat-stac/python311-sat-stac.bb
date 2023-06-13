SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-sat-stac-0.4.1-1.4.noarch.rpm"
RPM_HASH = "7c95f901492cb02e080e46ec30ba35644d318f1a9ed1d826b3253a181a3d1d01c1cd3f01ef84129d6a697b496aa127eb03452eb567e4b039e29e1bdb44acfac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sat-stac) \
python311-sat-stac \
python3dist(sat-stac)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-python-dateutil \
python311-requests \
update-alternatives"

inherit rpm
