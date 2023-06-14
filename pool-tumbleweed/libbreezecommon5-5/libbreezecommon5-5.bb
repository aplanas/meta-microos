SUMMARY = "Library containing support code for the Breeze Qt5 style"
DESCRIPTION = "Library containing support code for the Breeze Qt5 style."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libbreezecommon5-5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "b19fd938d6482ea4629be8add46d34e04a08e2d5e428ff1faf9a904d8c7be6c230e2e40024344a5bd8da440edf29aac5a5936dbf367c0c87951d3fe881391c43"

RPROVIDES:${PN} += "libbreezecommon5-5 \
libbreezecommon5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
