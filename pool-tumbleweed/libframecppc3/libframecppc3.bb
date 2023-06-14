SUMMARY = "C bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecppc3-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "a50d351c3a92e22f4fa13ad8015f2d5d67c21cef32ce90896ad731fbe5f109819b38ff1dbc12a75db513dbe7e74dcb74d3a33a931336795042623f6eab53e3db"

RPROVIDES:${PN} += "libframecppc.so.3 \
libframecppc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp.so.12 \
libframecpp3.so.6 \
libframecpp4.so.8 \
libframecpp6.so.8 \
libframecpp7.so.4 \
libframecpp8.so.7 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
