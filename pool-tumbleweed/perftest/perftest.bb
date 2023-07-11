SUMMARY = "IB Performance tests"
DESCRIPTION = "gen2 uverbs microbenchmarks"
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "4.5"

RPM_NAME = "perftest-4.5-2.4.aarch64.rpm"
RPM_HASH = "b5781a7bdf829708a3999523a3edee0c20966d951d72ed5f0bba1c30e4b741b1d13bb61e9e2986d65d59912660ad776eeee92df382885ac7f5257820cfbdcb24"

RPROVIDES:${PN} += "perftest"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libefa.so.1 \
libibumad.so.3 \
libibverbs.so.1 \
libm.so.6 \
libmlx5.so.1 \
libpci.so.3 \
librdmacm.so.1"

inherit rpm
