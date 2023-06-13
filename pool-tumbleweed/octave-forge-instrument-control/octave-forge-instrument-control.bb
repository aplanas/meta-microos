SUMMARY = "Instrument Control for Octave"
DESCRIPTION = "Low level I/O functions for serial, i2c, parallel, tcp, gpib, vxi11 and usbtmc interfaces. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "octave-forge-instrument-control-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "fce4fcd9b21ca7c43b02d2e4d5bcb23c72b05ae31a076411e71ff91fcb86aa1f2fdb1200e9499dd51b6645fd4e756b718dd7bf0db8fc932a8f321f1d8b3cd842"

RPROVIDES:${PN} += "octave-forge-instrument-control \
octave-forge-instrument-control(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli"

inherit rpm
