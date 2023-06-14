SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp6-8-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "189fd50af36e1887f260cd57224da8de24f9ca3e41ecb5de7512a1b4bf74bdf072da4b9c8902074bda67708d5074ea069049efea27e7943b1bfbcdcb61364798"

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
