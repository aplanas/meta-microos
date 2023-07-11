SUMMARY = "Monitor Program for the icecream Compile Farm"
DESCRIPTION = "icecream is the next generation distcc. This package provides a monitor \
program."
LICENSE = "GPL-2.0-or-later"

PV = "3.3"

RPM_NAME = "icecream-monitor-3.3-1.22.aarch64.rpm"
RPM_HASH = "3b433adde3a9ff2fecf718e5d72d257828c4b060afce6ad441c15db13d7b8619154c8cf22db1be2da859ac9e411b855954ab2c3f8399cba6b96e953f56d99e57"

RPROVIDES:${PN} += "icecream-monitor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
liblzo2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
