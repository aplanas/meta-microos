SUMMARY = "Monitor Program for the icecream Compile Farm"
DESCRIPTION = "icecream is the next generation distcc. This package provides a monitor \
program."
LICENSE = "GPL-2.0-or-later"

PV = "3.3"

RPM_NAME = "icecream-monitor-3.3-1.21.aarch64.rpm"
RPM_HASH = "3ba5e2216af7924eb72cdb4d11a92145551aaeedd8f5f1cddfc82ec77bb289f493f6318fe15b6e25fdf2e9d023f93e2c2a362b8994142e3e169f2bfbf567d80d"

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
