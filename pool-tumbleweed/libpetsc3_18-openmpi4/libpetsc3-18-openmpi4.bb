SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-openmpi4-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "03415a60053606d7303be38b2021e1993e6287342308dab05749cd8343a902ce62d7f1a6ae6f61d6b8628b10cacae344e6e419c41f62f63ce221a7d8b153a39b"

RPROVIDES:${PN} += "libpetsc.so.3.18()(64bit) \
libpetsc3_18-openmpi4 \
libpetsc3_18-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libamd.so.2()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libcholmod.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit) \
libklu.so.1()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libmpi_mpifh.so.40()(64bit) \
libptscotch.so.0()(64bit) \
libptscotcherrexit.so.0()(64bit) \
libptscotchparmetis.so.0()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libspqr.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libumfpack.so.5()(64bit)"

inherit rpm
