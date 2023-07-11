SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp4-8-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "c73ba25f12d1854e4238264d684efa7aa24ac1cd1bc9ffe573732a360ea23a87d6ab90c7df12bfcb94a7fb2c0be70442187aad8cf9739e46a4dd2e7f836a747b"

RPROVIDES:${PN} += "libframecpp4-8 \
libframecpp4.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.6 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
