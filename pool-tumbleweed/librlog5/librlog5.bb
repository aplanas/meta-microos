SUMMARY = "C++ Logging Library"
DESCRIPTION = "RLOG is a C++ library to manage message logging."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "librlog5-1.4-19.5.aarch64.rpm"
RPM_HASH = "bbb19fc06b089fee40736250bca0babeaabeb6872bbe41a0635b261a3d82de991e27bb2f0270720f130d40ab1bba61962c32ce2774601a28ee1d006bf55297a4"

RPROVIDES:${PN} += "librlog.so.5 \
librlog5 \
rlog"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
