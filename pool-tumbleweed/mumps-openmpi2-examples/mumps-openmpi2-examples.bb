SUMMARY = "Test programs and examples for mumps"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This packages contains some test and examples programs for mumps. In addition, \
matlab and scilab extensions are provided in /usr/share/doc/packages/mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi2-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "a32d3f4f7cbbe464b723bf80b736f5b0350be7ca8a539d30531c0b2faefd81e44f6bb4fc2977a7616ca2f17e765bf10b5d7ebfb66a48b8a5be3fa17424b5cdd3"

RPROVIDES:${PN} += "mumps(examples)(openmpi) \
mumps-openmpi2-examples \
mumps-openmpi2-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblacs.so.2.1.0()(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcmumps.so.5.3.5()(64bit) \
libdmumps.so.5.3.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.20()(64bit) \
libmpi_mpifh.so.20()(64bit) \
libmpi_usempi_ignore_tkr.so.20()(64bit) \
libmpi_usempif08.so.20()(64bit) \
libmumps5_3_5-openmpi2 \
libmumps_common$.so.5.3.5()(64bit) \
libpord.so.5.3.5()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libsmumps.so.5.3.5()(64bit) \
libzmumps.so.5.3.5()(64bit)"

inherit rpm
