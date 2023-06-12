SUMMARY = "A collection of libraries of numerical algorithms"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This subpackage contains the shared libraries."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos14-openmpi2-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "ddc043d8750d780536aed750b2f82e024d9d80f00968830b60a484ec09cdcb6f2f7907e337c70d94a65be50efcb727d79061b1c95b38ed714c67bac7a043529b"

RPROVIDES:${PN} += "libModeLaplace.so.14()(64bit) \
libamesos.so.14()(64bit) \
libamesos2.so.14()(64bit) \
libanasazi.so.14()(64bit) \
libanasaziepetra.so.14()(64bit) \
libanasazitpetra.so.14()(64bit) \
libaztecoo.so.14()(64bit) \
libbelos.so.14()(64bit) \
libbelosepetra.so.14()(64bit) \
libbelostpetra.so.14()(64bit) \
libbelosxpetra.so.14()(64bit) \
libepetra.so.14()(64bit) \
libepetraext.so.14()(64bit) \
libexodus.so.14()(64bit) \
libgaleri-epetra.so.14()(64bit) \
libgaleri-xpetra.so.14()(64bit) \
libifpack.so.14()(64bit) \
libifpack2-adapters.so.14()(64bit) \
libifpack2.so.14()(64bit) \
libintrepid.so.14()(64bit) \
libintrepid2.so.14()(64bit) \
libisorropia.so.14()(64bit) \
libkokkosalgorithms.so.14()(64bit) \
libkokkoscontainers.so.14()(64bit) \
libkokkoscore.so.14()(64bit) \
libkokkoskernels.so.14()(64bit) \
libkokkossimd.so.14()(64bit) \
libkokkostsqr.so.14()(64bit) \
libloca.so.14()(64bit) \
liblocaepetra.so.14()(64bit) \
liblocalapack.so.14()(64bit) \
liblocathyra.so.14()(64bit) \
liblocatpetra.so.14()(64bit) \
libminitensor.so.14()(64bit) \
libml.so.14()(64bit) \
libmuelu-adapters.so.14()(64bit) \
libmuelu.so.14()(64bit) \
libnemesis.so.14()(64bit) \
libnox.so.14()(64bit) \
libnoxepetra.so.14()(64bit) \
libnoxlapack.so.14()(64bit) \
libpamgen.so.14()(64bit) \
libpamgen_extras.so.14()(64bit) \
libphalanx.so.14()(64bit) \
librol.so.14()(64bit) \
librtop.so.14()(64bit) \
libsacado.so.14()(64bit) \
libshards.so.14()(64bit) \
libshylu_nodehts.so.14()(64bit) \
libstokhos.so.14()(64bit) \
libstokhos_amesos2.so.14()(64bit) \
libstokhos_ifpack2.so.14()(64bit) \
libstokhos_ifpack2_mp_16_openmp.so.14()(64bit) \
libstokhos_ifpack2_pce_openmp.so.14()(64bit) \
libstokhos_muelu.so.14()(64bit) \
libstokhos_muelu_mp_16_openmp.so.14()(64bit) \
libstokhos_muelu_pce_openmp.so.14()(64bit) \
libstokhos_sacado.so.14()(64bit) \
libstokhos_tpetra.so.14()(64bit) \
libstokhos_tpetra_mp_16_openmp.so.14()(64bit) \
libstokhos_tpetra_pce_openmp.so.14()(64bit) \
libstokhos_tpetra_sd_mp_16_openmp.so.14()(64bit) \
libstokhos_tpetra_sd_pce_openmp.so.14()(64bit) \
libstokhos_tpetraext_mp_16_openmp.so.14()(64bit) \
libstokhos_tpetraext_pce_openmp.so.14()(64bit) \
libstokhos_xpetra.so.14()(64bit) \
libstokhos_xpetra_mp_16_openmp.so.14()(64bit) \
libstokhos_xpetra_pce_openmp.so.14()(64bit) \
libstratimikos.so.14()(64bit) \
libstratimikosamesos.so.14()(64bit) \
libstratimikosamesos2.so.14()(64bit) \
libstratimikosaztecoo.so.14()(64bit) \
libstratimikosbelos.so.14()(64bit) \
libstratimikosifpack.so.14()(64bit) \
libstratimikosml.so.14()(64bit) \
libtacho.so.14()(64bit) \
libteko.so.14()(64bit) \
libtempus.so.14()(64bit) \
libteuchoscomm.so.14()(64bit) \
libteuchoscore.so.14()(64bit) \
libteuchoskokkoscomm.so.14()(64bit) \
libteuchoskokkoscompat.so.14()(64bit) \
libteuchosnumerics.so.14()(64bit) \
libteuchosparameterlist.so.14()(64bit) \
libteuchosparser.so.14()(64bit) \
libteuchosremainder.so.14()(64bit) \
libthyracore.so.14()(64bit) \
libthyraepetra.so.14()(64bit) \
libthyraepetraext.so.14()(64bit) \
libthyratpetra.so.14()(64bit) \
libtpetra.so.14()(64bit) \
libtpetraclassic.so.14()(64bit) \
libtpetraext.so.14()(64bit) \
libtpetrainout.so.14()(64bit) \
libtrilinos14-openmpi2 \
libtrilinos14-openmpi2(aarch-64) \
libtrilinoscouplings.so.14()(64bit) \
libtrilinosss.so.14()(64bit) \
libtriutils.so.14()(64bit) \
libxpetra-sup.so.14()(64bit) \
libxpetra.so.14()(64bit) \
libzoltan.so.14()(64bit) \
libzoltan2.so.14()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmpi.so.20()(64bit) \
libnetcdf.so.19()(64bit) \
libopenblas.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
