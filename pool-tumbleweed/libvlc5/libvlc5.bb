SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlc5-3.0.18-7.3.aarch64.rpm"
RPM_HASH = "436b1412b1c6ea43825f3e6294b68aa09384f19cddab29ac82fd3fe3a200476030962c192fcdc5f73fad703bc5d34d356140da548250432504f8d3a8ccfe174e"

RPROVIDES:${PN} += "libvlc.so.5 \
libvlc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvlccore.so.9"

inherit rpm
