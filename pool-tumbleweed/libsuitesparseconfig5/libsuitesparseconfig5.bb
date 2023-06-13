SUMMARY = "Common configurations for all packages in SuiteSparse"
DESCRIPTION = "SuiteSparse_config is required by a number of sparse matrix packages, \
including SuiteSparseQR, AMD, COLAMD, CCOLAMD, CHOLMOD, KLU, BTF, \
LDL, CXSparse, RBio, and UMFPACK. It is not required by CSparse, \
which is a stand-alone packages. Mongoose uses SuiteSparse_config, \
if available but works also without it. \
 \
SuiteSparse_config contains a configuration file for 'make' \
(SuiteSparse_config.mk) and an include file (SuiteSparse_config.h). \
Also included in SuiteSparse_config is a replacement for the \
BLAS/LAPACK xerbla routine that does not print a warning message \
(helpful if you don't want to link the entire Fortran I/O library \
into a C application). \
 \
SuiteSparse_config is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "5.13.0"

RPM_NAME = "libsuitesparseconfig5-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "9a5487bfa3fae49b24bd4a8e2047e87bc31a2a208e09d5b36d870a63f59f625d75802ea5149c876c799879c7966dd1ed4bc8f482d54b6d74b252815c4e4a729a"

RPROVIDES:${PN} += "libUFconfig \
libsuitesparseconfig.so.5()(64bit) \
libsuitesparseconfig5 \
libsuitesparseconfig5(aarch-64) \
libsuitesparseconfig5_13_0 \
libufconfig"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
