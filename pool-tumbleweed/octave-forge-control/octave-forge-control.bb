SUMMARY = "Computer-Aided Control System Design (CACSD) Tools"
DESCRIPTION = "Computer-Aided Control System Design (CACSD) Tools for GNU Octave, based \
on the proven SLICOT Library. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.0"

RPM_NAME = "octave-forge-control-3.4.0-1.9.aarch64.rpm"
RPM_HASH = "9021733730693f05e448280edb6d68d7ebf54cd272d5b43e3438a3b6a60c2ca030abe77e3720008b78be32c49f6e014462e464415493f5e55b8309fa1c0fa7db"

RPROVIDES:${PN} += "octave-forge-control \
octave-forge-control(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenblas.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli"

inherit rpm
