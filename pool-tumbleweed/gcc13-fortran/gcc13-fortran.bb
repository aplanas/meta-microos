SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-fortran-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "f46b66782a3fefb3e3e1e73f4a660bdc5a9cc157a1626c6eaa3e430dc7b89ce35cad1879108f5e87f925ed3a3b68e85195f4c96939f6e0b591176cd126a63c2d"

RPROVIDES:${PN} += "gcc13-fortran \
gcc13-fortran(aarch-64)"
RDEPENDS:${PN} += "gcc13 \
libc.so.6(GLIBC_2.36)(64bit) \
libgfortran5 \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
