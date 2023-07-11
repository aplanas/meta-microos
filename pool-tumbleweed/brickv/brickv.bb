SUMMARY = "Tinkerforge Brick Viewer"
DESCRIPTION = "Small Qt GUI to control and test all Bricks and Bricklets from Tinkerforge."
LICENSE = "GPL-2.0-only"

PV = "2.4.25"

RPM_NAME = "brickv-2.4.25-1.4.noarch.rpm"
RPM_HASH = "ea3eea7410adab6ea2b85ceb9175f22a43d0ce639e1da31ae935a56ea59b98bf201a44626ac45ad77cc55581a9a40869d2f5b3ea0fab37aea176d07555188eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brickv \
python3.11dist-brickv \
python3dist-brickv"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-pytz \
python3-qt5 \
python3-serial \
python3-tzlocal"

inherit rpm
