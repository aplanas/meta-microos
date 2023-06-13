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

RPM_NAME = "mumps-scotch-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "3198b9658f4cbf39b5c0ef1b8c93a186987b92247047c9f91c950cc4432f2c597ba84781a946542fd329b035b8c64e81dd051b5df45df79c3c4ccbe5d3cb2a86"

RPROVIDES:${PN} += "mumps(examples)() \
mumps-scotch-examples \
mumps-scotch-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libcmumps_scotch.so.5.3.5()(64bit) \
libdmumps_scotch.so.5.3.5()(64bit) \
libesmumps.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpiseq_scotch.so.5.3.5()(64bit) \
libmumps-scotch5_3_5 \
libmumps_common.so.5.3.5()(64bit) \
libpord_scotch.so.5.3.5()(64bit) \
libscotch.so.0()(64bit) \
libscotcherr.so.0()(64bit) \
libsmumps_scotch.so.5.3.5()(64bit) \
libzmumps_scotch.so.5.3.5()(64bit)"

inherit rpm
