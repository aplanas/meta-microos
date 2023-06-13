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

RPM_NAME = "mumps-ptscotch-openmpi3-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "e78d887310884856ea17c16e66dcb73715665d30d9937d4222efaa2bfc066fb60ac21c97b0793e4ec687632580b216d4c394f1c23cdc9ada6cbacb9968f902c6"

RPROVIDES:${PN} += "mumps(examples)(openmpi) \
mumps-ptscotch-openmpi3-examples \
mumps-ptscotch-openmpi3-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblacs.so.2.1.0()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libcmumps_ptscotch.so.5.3.5()(64bit) \
libdmumps_ptscotch.so.5.3.5()(64bit) \
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
libmumps-ptscotch5_3_5-openmpi3 \
libmumps_common.so.5.3.5()(64bit) \
libpord_ptscotch.so.5.3.5()(64bit) \
libptesmumps.so.0()(64bit) \
libptscotch.so.0()(64bit) \
libptscotcherr.so.0()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libscotch.so.0()(64bit) \
libsmumps_ptscotch.so.5.3.5()(64bit) \
libzmumps_ptscotch.so.5.3.5()(64bit)"

inherit rpm
