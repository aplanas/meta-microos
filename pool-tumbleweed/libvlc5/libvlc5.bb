SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlc5-3.0.18-8.1.aarch64.rpm"
RPM_HASH = "9ff8a33e7e280a243e668edc13e802df8db6257598918af28a17c40c2b35a7b1c2b9497bfc2f4de0be8455572e27244b773868ffcd008e34a835468b7b7c4e7d"

RPROVIDES:${PN} += "libvlc.so.5 \
libvlc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvlccore.so.9"

inherit rpm
