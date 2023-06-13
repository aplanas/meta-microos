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

RPM_NAME = "mumps-openmpi4-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "b284dbad138cb22fab2a4d35eaabd96dd211a20a5dad12bed6696d8a0ca3d242d0b24b27c42e215f181cfd1a469c96b563d86c28106ae3357be1dbed53c822bc"

RPROVIDES:${PN} += "mumps(examples)(openmpi) \
mumps-openmpi4-examples \
mumps-openmpi4-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblacs.so.2.1.0()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libcmumps.so.5.3.5()(64bit) \
libdmumps.so.5.3.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libmpi_mpifh.so.40()(64bit) \
libmpi_usempi_ignore_tkr.so.40()(64bit) \
libmpi_usempif08.so.40()(64bit) \
libmumps5_3_5-openmpi4 \
libmumps_common$.so.5.3.5()(64bit) \
libpord.so.5.3.5()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libsmumps.so.5.3.5()(64bit) \
libzmumps.so.5.3.5()(64bit)"

inherit rpm
