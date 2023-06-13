SUMMARY = "IB Performance tests"
DESCRIPTION = "gen2 uverbs microbenchmarks"
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "4.5"

RPM_NAME = "perftest-4.5-2.3.aarch64.rpm"
RPM_HASH = "36537265de1882c1ac97365085d5ac622781fad5c4a0819a1eee96ce82718d3e3f0ec17541b4ce65d3213c6fa1614b45e2f36b61155c25af2c96d20e16772d38"

RPROVIDES:${PN} += "perftest \
perftest(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libefa.so.1()(64bit) \
libibumad.so.3()(64bit) \
libibverbs.so.1()(64bit) \
libm.so.6()(64bit) \
libmlx5.so.1()(64bit) \
libpci.so.3()(64bit) \
librdmacm.so.1()(64bit)"

inherit rpm
