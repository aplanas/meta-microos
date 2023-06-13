SUMMARY = "The Parma Polyhedra Library"
DESCRIPTION = "The Parma Polyhedra Library (PPL) is a library for the manipulation of \
(not necessarily closed) convex polyhedra and other numerical \
abstractions.  The applications of convex polyhedra include program \
analysis, optimized compilation, integer and combinatorial optimization \
and statistical data-editing.  The Parma Polyhedra Library comes with \
several user friendly interfaces, is fully dynamic (available virtual \
memory is the only limitation to the dimension of anything), written in \
accordance to all the applicable standards, exception-safe, rather \
efficient, thoroughly documented, and free software.  This package \
provides all what is necessary to run applications using the PPL \
through its C and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-1.2-3.1.aarch64.rpm"
RPM_HASH = "0116619c6a660d8f1d7f62171f86795ca799a154cb2b092b0798acc969218c117b70c6c3f2843dc6657be9bbbad93c85b6dda5ceb0bf95068905cccaf321d388"

RPROVIDES:${PN} += "ppl \
ppl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libppl.so.14()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
