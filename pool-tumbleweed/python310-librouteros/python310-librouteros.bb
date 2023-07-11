SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "python310-librouteros-3.2.1-1.5.noarch.rpm"
RPM_HASH = "8a38f8fe05b538f92e6a6c619a5b702da43b24381978ef0bd9acdb83f6594c9b09ad42b515e11885122890283d319e5c076cbcf765d72226894bbb30ab504de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-librouteros \
python310-librouteros \
python3dist-librouteros"

RDEPENDS:${PN} += "python-abi"

inherit rpm
