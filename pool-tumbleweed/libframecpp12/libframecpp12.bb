SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp12-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "4bc27bb4697f55a05e2fe864c2c868d7b22b951f80c68a2617c90b6435c8060a4fe6080be6032f29bcbbee77846c19519eaf25873ed0d708a647fb1623ad2141"

RPROVIDES:${PN} += "libframecpp.so.12 \
libframecpp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
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
