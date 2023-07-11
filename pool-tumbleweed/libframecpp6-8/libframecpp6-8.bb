SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp6-8-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "4a340a791e2508d29d87aafdcc2bcfb7d383ad1a2ad8293bbdb31917f33bfcb529ffd3e17add2a822d229a6bb585f7bb2eb79ff9931e516486b38867d3a8390a"

RPROVIDES:${PN} += "libframecpp6-8 \
libframecpp6.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.6 \
libframecpp4.so.8 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
