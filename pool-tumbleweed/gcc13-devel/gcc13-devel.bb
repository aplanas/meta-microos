SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-devel-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "41f86dd8298c866557e12b955bf4b16bb96836b0d91fe13743d9d00b8f9c8f18579b00465ba327aa3f245122ead92b19f92c31e6427d5ccb40282ffcc22f195b"

RPROVIDES:${PN} += "gcc13-devel"

RDEPENDS:${PN} += "gcc13 \
gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mpc-devel"

inherit rpm
