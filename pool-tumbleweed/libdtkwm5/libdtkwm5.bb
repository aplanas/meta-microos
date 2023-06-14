SUMMARY = "Dtkwm libraries"
DESCRIPTION = "DtkWm is used to handle double screen for deepin desktop development. \
This package contains the shared libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.12"

RPM_NAME = "libdtkwm5-2.0.12-2.10.aarch64.rpm"
RPM_HASH = "b1f92fab68f9a92a42c5d27168f4e2f9ca4145930b38b270fe9b1aa98712b97e1f6998108698525a949010e9dcc53a99b312d18cfdbcfea0fe51da3a801dbeec"

RPROVIDES:${PN} += "libdtkwm.so.5 \
libdtkwm5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libdtkcore.so.5 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
