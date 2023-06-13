SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "python311-librouteros-3.2.1-1.3.noarch.rpm"
RPM_HASH = "6f740ef0b5698b74aec28fa6e99b5e6a4c418e20dcda4b3b016a331f8d6aeed64d7d7540536dfce736edc7ec023d8f0e9c1f587a6fcdccd053a5fc88bf233e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(librouteros) \
python311-librouteros \
python3dist(librouteros)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
