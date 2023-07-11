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

RPM_NAME = "libsuitesparseconfig5-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "340f98d18fdd2c2ffaf1f089b73fc31516360bbfe32e67c9e309b7b2400c370e26b3b9a6743fd11d4d340d5ab2975245423e9bc6379ea0be3b0be1f9b4e9839b"

RPROVIDES:${PN} += "libUFconfig \
libsuitesparseconfig.so.5 \
libsuitesparseconfig5 \
libsuitesparseconfig5-13-0 \
libufconfig"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
