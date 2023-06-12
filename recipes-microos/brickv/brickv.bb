SUMMARY = "Tinkerforge Brick Viewer"
DESCRIPTION = "Small Qt GUI to control and test all Bricks and Bricklets from Tinkerforge."
LICENSE = "GPL-2.0-only"

PV = "2.4.25"

RPM_NAME = "brickv-2.4.25-1.3.noarch.rpm"
RPM_HASH = "e263bf6f48fbf43d635481b969ad19f45a55005fabeb9cad9aca442858ee9efea3908247ac5f52707b4ba207a8b162018b41bbe82808a61a312b6d2de2fb8af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(brickv.desktop) \
brickv \
python3.10dist(brickv) \
python3dist(brickv)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-pytz \
python3-qt5 \
python3-serial \
python3-tzlocal"

inherit rpm
