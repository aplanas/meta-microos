SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "python311-librouteros-3.2.1-1.5.noarch.rpm"
RPM_HASH = "98dc8f08d79a159cc734017f020f444e2fd99c98f0f61c0c949a0d987afcbbc74ac404f561dad2adf7370087c48aaad1fe6b66fcd299512425abc57e3728eb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-librouteros \
python3.11dist-librouteros \
python311-librouteros \
python3dist-librouteros"

RDEPENDS:${PN} += "python-abi"

inherit rpm
