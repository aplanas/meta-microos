SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "python310-librouteros-3.2.1-1.3.noarch.rpm"
RPM_HASH = "52e3de17a397f9b552ef44239cc80c01bcd57a6dc2cf76c95f91fa67618cb4d90d47234da04c3db79cf4ad62fdccef108ad0ba402f5ae91b153c0a95ef5c82ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-librouteros \
python3.10dist(librouteros) \
python310-librouteros \
python3dist(librouteros)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
