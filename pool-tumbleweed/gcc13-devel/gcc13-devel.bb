SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-devel-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "7de379f1afd3a1a152411f4b12c184353afe69f02ad78ee3494d1e8943804b311b2942aa27c6849b473389f847554fe56561bc5889fb6cff7d2aeac9037af4f2"

RPROVIDES:${PN} += "gcc13-devel"

RDEPENDS:${PN} += "gcc13 \
gmp-devel \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mpc-devel"

inherit rpm
