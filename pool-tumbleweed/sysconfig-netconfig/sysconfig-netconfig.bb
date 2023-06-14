SUMMARY = "Script to apply network provided settings"
DESCRIPTION = "This package provides the netconfig scripts to apply network \
provided settings like DNS or NIS into system files."
LICENSE = "GPL-2.0-or-later"

PV = "0.90.0"

RPM_NAME = "sysconfig-netconfig-0.90.0-3.2.aarch64.rpm"
RPM_HASH = "81abeca81e0734b26ed578a8c9ecd15b488988f42242dcfd1c314f6881c88671210e9c12535931ea642c1a1c9ce57860cc9307593321af3deffcaaf72e3f62f4"

RPROVIDES:${PN} += "/sbin/netconfig \
config-sysconfig-netconfig \
sysconfig-netconfig"

RDEPENDS:${PN} += "/bin/bash \
/bin/gawk \
/bin/logger \
sysconfig"

inherit rpm
