SUMMARY = "Support programs for the open source SDR hardware"
DESCRIPTION = "Tools for HackRF, an open source hardware project to build a Software \
Defined Radio (SDR) peripheral."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-2023.01.1-1.2.aarch64.rpm"
RPM_HASH = "92e0cad19e52dae23e7a0d63a4a58d26c9b86aef8be67e5593b27674f492361fb50dd5a0e5ab05715518208c5c8c4f3166bb4f37aab913b484fdadc1322c1f8e"

RPROVIDES:${PN} += "hackrf \
hackrf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libhackrf.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
