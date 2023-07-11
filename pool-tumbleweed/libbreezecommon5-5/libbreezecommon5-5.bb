SUMMARY = "Library containing support code for the Breeze Qt5 style"
DESCRIPTION = "Library containing support code for the Breeze Qt5 style."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libbreezecommon5-5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "d8483639bc591f1b420ce1fe7ca5318a21e4c0613050b32007c8d4a654f37436a493bcdd4ee3544bd2aac4389032c64e5c5738792d304959338cb3b7a285c944"

RPROVIDES:${PN} += "libbreezecommon5-5 \
libbreezecommon5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
