SUMMARY = "Clang based source code indexer"
DESCRIPTION = "Rtags is Clang based source file indexer supporting C/C++/Objective-C(++) code."
LICENSE = "GPL-3.0-or-later"

PV = "2.38"

RPM_NAME = "rtags-2.38-3.6.aarch64.rpm"
RPM_HASH = "319fe649a74eaf683f10627805fbc602e307a368e45ec1698317eca0876d39b09195268916fd6599649169e9fd8636daeea982f7506cabf07475363c9f740129"

RPROVIDES:${PN} += "rtags"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
