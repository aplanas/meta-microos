SUMMARY = "Headers and development files for trilinos"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the headers and libraries files for trilinos \
needed for development."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-devel-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "27038259e5d310021b39266f192aef874f16d06e473912ca462960d39d7a39e2026ebd4117ee8069d8c346a11ecf27a4865abc0597d1e5740c355a7e3df95a46"

RPROVIDES:${PN} += "cmake-Amesos \
cmake-Amesos2 \
cmake-Anasazi \
cmake-AztecOO \
cmake-Belos \
cmake-Epetra \
cmake-EpetraExt \
cmake-Galeri \
cmake-Ifpack \
cmake-Ifpack2 \
cmake-Intrepid \
cmake-Intrepid2 \
cmake-Isorropia \
cmake-Kokkos \
cmake-KokkosAlgorithms \
cmake-KokkosContainers \
cmake-KokkosCore \
cmake-KokkosKernels \
cmake-KokkosSimd \
cmake-ML \
cmake-MiniTensor \
cmake-MueLu \
cmake-NOX \
cmake-Pamgen \
cmake-Phalanx \
cmake-ROL \
cmake-RTOp \
cmake-SEACAS \
cmake-SEACASExodus \
cmake-SEACASNemesis \
cmake-Sacado \
cmake-Shards \
cmake-ShyLU-Node \
cmake-ShyLU-NodeHTS \
cmake-ShyLU-NodeTacho \
cmake-Stokhos \
cmake-Stratimikos \
cmake-Teko \
cmake-Tempus \
cmake-Teuchos \
cmake-TeuchosComm \
cmake-TeuchosCore \
cmake-TeuchosKokkosComm \
cmake-TeuchosKokkosCompat \
cmake-TeuchosNumerics \
cmake-TeuchosParameterList \
cmake-TeuchosParser \
cmake-TeuchosRemainder \
cmake-Thyra \
cmake-ThyraCore \
cmake-ThyraEpetraAdapters \
cmake-ThyraEpetraExtAdapters \
cmake-ThyraTpetraAdapters \
cmake-Tpetra \
cmake-TpetraCore \
cmake-TpetraTSQR \
cmake-TriBITS \
cmake-Trilinos \
cmake-TrilinosCouplings \
cmake-TrilinosSS \
cmake-Triutils \
cmake-Xpetra \
cmake-Zoltan \
cmake-Zoltan2Core \
trilinos-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
glpk-devel \
hdf5-devel \
lapack-devel \
libtrilinos14 \
libxml2-devel \
mumps-devel \
netcdf-devel \
scotch-devel \
suitesparse-common-devel \
swig \
umfpack-devel"

inherit rpm
