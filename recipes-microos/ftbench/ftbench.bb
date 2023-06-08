SUMMARY = "Run FreeType benchmarks"
DESCRIPTION = "Run FreeType benchmarks \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftbench-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "e1e1fad15fac56b580e1906c3bd9f0af54482935437641d2d8c4443bd785fd9d081a6c1afd560251c623373df0fc824f52527510124040539a93a63096445d71"

RPROVIDES:${PN} += "ftbench ftbench(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit)"

inherit rpm
