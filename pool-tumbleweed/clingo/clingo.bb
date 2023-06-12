SUMMARY = "A grounder and solver for logic programs"
DESCRIPTION = "Clingo is part of the Potassco project for Answer Set Programming \
(ASP). ASP offers a simple and powerful modeling language to describe \
combinatorial problems as logic programs. The clingo system then takes \
such a logic program and computes answer sets representing solutions \
to the given problem."
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "clingo-5.6.2-1.3.aarch64.rpm"
RPM_HASH = "097b08cec76c80f602a7466669454a947b54e2eec04aa3ea4dec0a2aabc3d6ffa356e1b767aad08f4c1cf8f099c086e1fa46186ee8699b0b399a96aaf322bde5"

RPROVIDES:${PN} += "clingo \
clingo(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libclingo.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
