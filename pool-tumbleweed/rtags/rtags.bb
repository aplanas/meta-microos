SUMMARY = "Clang based source code indexer"
DESCRIPTION = "Rtags is Clang based source file indexer supporting C/C++/Objective-C(++) code."
LICENSE = "GPL-3.0-or-later"

PV = "2.38"

RPM_NAME = "rtags-2.38-3.7.aarch64.rpm"
RPM_HASH = "74cddbf936973283280462f8ee48d63be6f87735ceadde536edc31d1a2d8832f01fa88c91af82c17ea2b5b1f52ebfbdd8f27ef9c3c40179020047e20e68eb22a"

RPROVIDES:${PN} += "rtags"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
