SUMMARY = "Miscellaneous functions for Octave"
DESCRIPTION = "Miscellaneous functions for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "octave-forge-miscellaneous-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "0e8c9edf2ad917a7184b4646250da37efa55a97dbc45eedd86537201e7fd761434d626ee1f87966df7ff8969833b8b421911aa439b5d5944bb17ed791cfd90d7"

RPROVIDES:${PN} += "octave-forge-miscellaneous \
octave-forge-miscellaneous(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli \
octave-forge-general \
units"

inherit rpm
