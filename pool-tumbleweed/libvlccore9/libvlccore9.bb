SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlccore9-3.0.18-9.1.aarch64.rpm"
RPM_HASH = "a39775fc5252a7c9812094949b98b2379001b4b0f8c09036ca040ea7d81b741ae0e2ff90f5b746b3c5fc232df4b9456f01a9ec3be4fa90f46c658d2945ebb88a"

RPROVIDES:${PN} += "libvlccore.so.9 \
libvlccore9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libidn.so.12 \
libm.so.6"

inherit rpm
