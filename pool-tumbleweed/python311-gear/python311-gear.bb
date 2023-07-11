SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python311-gear-0.16.0-1.6.noarch.rpm"
RPM_HASH = "e064560cd12f7aaf6cc2ed341acbac7e05ac1e876ab4b1ec5c8d5d9476d2b4a9de7c2327189361a83fcb44220dc4681e4263ef5d3b9b674dc3467927f044151d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gear \
python3.11dist-gear \
python311-gear \
python3dist-gear"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-extras \
python311-pbr \
python311-python-daemon \
python311-six \
update-alternatives"

inherit rpm
