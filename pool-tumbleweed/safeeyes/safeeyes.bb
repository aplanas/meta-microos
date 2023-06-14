SUMMARY = "Tool for reminding the user to take breaks"
DESCRIPTION = "This utility reminds the user to take breaks whilst they are working \
at the computer in an effort to alleviate eye strain (asthenopia)."
LICENSE = "GPL-3.0-only"

PV = "2.1.4"

RPM_NAME = "safeeyes-2.1.4-1.2.noarch.rpm"
RPM_HASH = "14bc33f75814c0bab4e3c7a7643e289e90fb4b690caea80b6bf50986457671dc1cf9c1bd405905db223bf065409b782d42637ee632fdfefeb5fa31d07f4da25f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-safeeyes \
python3dist-safeeyes \
safeeyes"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-cairo \
python3-croniter \
python3-gobject \
python3-psutil \
python3-python-xlib \
typelib-AppIndicator3 \
typelib-Notify"

inherit rpm
