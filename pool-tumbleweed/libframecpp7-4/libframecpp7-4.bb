SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp7-4-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "acd0b895842cad85420e3b0d635735ddd287bd523f74b3a03337184278c415fd9623436edb664a89e7fd98ce8649fe540b6d3a2b7ada999012ed16d21c65dda1"

RPROVIDES:${PN} += "libframecpp7-4 \
libframecpp7.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.6 \
libframecpp4.so.8 \
libframecpp6.so.8 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
