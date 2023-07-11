SUMMARY = "Switch X keyboard layouts from the command line"
DESCRIPTION = "xkb-switch is a C++ program that allows to query and change the XKB layout state."
LICENSE = "GPL-3.0-only"

PV = "1.8.5"

RPM_NAME = "xkb-switch-1.8.5-1.9.aarch64.rpm"
RPM_HASH = "81a586c8267eb89a3f16536a7aaf7a4955a2ed029532df3d87a839e1f120c595dfc13310a9e0471d4a3cf811440c4c73b0c14793ae98fa9fccd82281e92d88c5"

RPROVIDES:${PN} += "libxkbswitch.so.1 \
xkb-switch"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxkbfile.so.1"

inherit rpm
