SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-devel-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "5ce44637f680fc5a5ade0276458cc09bb5eb405fc55ec81db32d9fc08950e6082d006868c3665167ff2f4263f40a5b059c13f317750a3871341af99927927cd3"

RPROVIDES:${PN} += "gcc13-devel"

RDEPENDS:${PN} += "gcc13 \
gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mpc-devel"

inherit rpm
