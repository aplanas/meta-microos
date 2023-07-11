SUMMARY = "C bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecppc3-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "c2d6ae0cf3d8aec8c2ce9e59f6abafe99577d9c12f2153be6e939ea7a69218cc1a48bbc73bc6d528d9fc9ed27257775a41bf15734250198bd2f7d9e1ff02d71f"

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
