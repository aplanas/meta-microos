SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "python39-librouteros-3.2.1-1.5.noarch.rpm"
RPM_HASH = "7e007d63d9e190ddec5b6eb3f6f2802df833282186a2c35ba53280bcb8591ae60fbe97e40b74374d54a2d57780e2ed79fa23e3ed6e59762482621200b6203032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-librouteros \
python39-librouteros \
python3dist-librouteros"

RDEPENDS:${PN} += "python-abi"

inherit rpm
