SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlc5-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "44ae481909000fce93c149108e3d742b1d824a1aa6155511edaccb37051b4ce2d3c6d18a66397b84ce44f9f9e357c894ce46eb91c5d102a018e71a201cfb4f88"

RPROVIDES:${PN} += "libvlc.so.5 \
libvlc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvlccore.so.9"

inherit rpm
