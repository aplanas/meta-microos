SUMMARY = "Polygon clipping in 2D"
DESCRIPTION = "'Clipper' is a C++ (and Delphi) library that implements polygon clipping."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Math-Clipper-1.29-1.23.aarch64.rpm"
RPM_HASH = "e86e2d9c1c00f3b0150c2ffeb488b5856efc2b4c84d2bad639cedc22b27b3027a92a4a5d416e438115804aac6e60ca6638b293ccaa58962ee94fac6d6de5621c"

RPROVIDES:${PN} += "perl(Math::Clipper) \
perl-Math-Clipper \
perl-Math-Clipper(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
