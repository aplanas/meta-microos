SUMMARY = "An open source finite element package"
DESCRIPTION = "CalculiX is a package designed to solve field problems. \
The method used is the finite element method. So far only \
structural problems can be solved but it is planned to \
extend the capabilities."
LICENSE = "BSD-3-Clause & GPL-2.0-only & SUSE-Public-Domain"

PV = "2.20"

RPM_NAME = "ccx-2.20-1.3.aarch64.rpm"
RPM_HASH = "71812de5b2940d204241150c087c45dcb4cc30d88a4a0a7a2d79957576168b55ded5e71218f9ab72a87b61155d1b8877d4b1cf0e6a645f6c47bc4d1ab9e4a211"

RPROVIDES:${PN} += "ccx \
ccx(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarpack.so.2()(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libspooles.so.2.2()(64bit)"

inherit rpm
