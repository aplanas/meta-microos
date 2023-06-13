SUMMARY = "Additional Structure manipulations functions for Octave"
DESCRIPTION = "Additional Structure manipulations functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.18"

RPM_NAME = "octave-forge-struct-1.0.18-1.6.aarch64.rpm"
RPM_HASH = "dc5c94dbf2b9608ed4563acf09891fddcb1c03b33304e642a08375a3a8ed9300188b3975ed4366b2cb94c212c92250bd83fc272867503b008418708aed3e0487"

RPROVIDES:${PN} += "octave-forge-struct \
octave-forge-struct(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli"

inherit rpm
