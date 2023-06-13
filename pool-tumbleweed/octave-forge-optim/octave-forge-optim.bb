SUMMARY = "Non-linear optimization toolkit for Octave"
DESCRIPTION = "Non-linear optimization toolkit. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "octave-forge-optim-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "dd11c66c1893baeacde1dd067975b537cd53dc1c9fc4cccce98361f6d03a152b4a86ee57d4aa1304cef2822f5df92163f6e091b41217d8aa2fa333f64cbfd1dd"

RPROVIDES:${PN} += "octave-forge-optim \
octave-forge-optim(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopenblas.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli \
octave-forge-parallel \
octave-forge-statistics \
octave-forge-struct"

inherit rpm
