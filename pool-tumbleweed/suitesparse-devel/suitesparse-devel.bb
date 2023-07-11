SUMMARY = "Development headers for SuiteSparse"
DESCRIPTION = "suitesparse is a collection of libraries for computations involving \
sparse matrices. \
 \
The suitesparse-devel package contains files needed for developing \
applications which use the suitesparse libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "suitesparse-devel-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "74afd7f0e5c8d3ab3395df946087d9e69de00f1fb67db771a625a9ffe2640f868ead350d41f76781e59c87fb9a32907c3256360f33b932d8c124237cd77a7c42"

RPROVIDES:${PN} += "SuiteSparse-config \
UFconfig-devel \
amd-devel \
libamd-devel \
libbtf-devel \
libcamd-devel \
libccolamd-devel \
libcholmod-devel \
libcolamd-devel \
libcsparse-devel \
libcxsparse-devel \
libgraphblas-devel \
libklu-devel \
libldl-devel \
libmongoose-devel \
librbio-devel \
libsliplu-devel \
libspqr-devel \
libsuitesparseconfig-devel \
libumfpack-devel \
suitesparse-common-devel \
suitesparse-devel \
umfpack-devel"

RDEPENDS:${PN} += "gcc-c++ \
libamd2 \
libbtf1 \
libcamd2 \
libccolamd2 \
libcholmod3 \
libcolamd2 \
libcsparse3 \
libcxsparse3 \
libgraphblas7 \
libklu1 \
libldl2 \
libmongoose2 \
librbio2 \
libsliplu1 \
libspqr2 \
libsuitesparseconfig5 \
libumfpack5 \
metis-devel \
openblas-devel \
tbb-devel"

inherit rpm
