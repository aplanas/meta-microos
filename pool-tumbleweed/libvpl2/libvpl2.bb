SUMMARY = "oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "The oneAPI Video Processing Library (oneVPL) provides a single video processing \
API for encode, decode, and video processing that works across a wide range of \
accelerators."
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl2-2023.2.0-1.2.aarch64.rpm"
RPM_HASH = "43b5ff3ff5c032cca29fbeb6098bc652a8de771cbd494135dd234461cea49ba8c0b940bd2b7294b4dd675d54995472cc2e1352ffedce361b6cb9589dc923723d"

RPROVIDES:${PN} += "libvpl.so.2 \
libvpl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
