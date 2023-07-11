SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp7-4-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "9c6732413c4fa02d9ac2e623cef878d7edf63c2a9bd55bf9ddcff09db826755f8f893c87268b4505a1c365119317627a179a7a3e646cf1661b4e9c57420e4dd4"

RPROVIDES:${PN} += "libframecpp7-4 \
libframecpp7.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.6 \
libframecpp4.so.8 \
libframecpp6.so.8 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
