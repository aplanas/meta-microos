SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp12-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "c2d4b936d4855f3a272aae75344d13c862484abe9cdace03d81e6b5c7b115dbbb31dc06be091559a40826c1b41f56e99ff44b41d6e7a4ec31bb9d678240ce065"

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
