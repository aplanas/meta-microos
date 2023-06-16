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

RPM_NAME = "libtrilinos14-openmpi4-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "e94584fd475dd29ef67ffd90c8f33dd072a9cc632088b6125da3eb9369642652d925bb6b1d332a95570af972109daed73829fd10934fe796628ab58a92004428"

RPROVIDES:${PN} += "libModeLaplace.so.14 \
libamesos.so.14 \
libamesos2.so.14 \
libanasazi.so.14 \
libanasaziepetra.so.14 \
libanasazitpetra.so.14 \
libaztecoo.so.14 \
libbelos.so.14 \
libbelosepetra.so.14 \
libbelostpetra.so.14 \
libbelosxpetra.so.14 \
libepetra.so.14 \
libepetraext.so.14 \
libexodus.so.14 \
libgaleri-epetra.so.14 \
libgaleri-xpetra.so.14 \
libifpack.so.14 \
libifpack2-adapters.so.14 \
libifpack2.so.14 \
libintrepid.so.14 \
libintrepid2.so.14 \
libisorropia.so.14 \
libkokkosalgorithms.so.14 \
libkokkoscontainers.so.14 \
libkokkoscore.so.14 \
libkokkoskernels.so.14 \
libkokkossimd.so.14 \
libkokkostsqr.so.14 \
libloca.so.14 \
liblocaepetra.so.14 \
liblocalapack.so.14 \
liblocathyra.so.14 \
liblocatpetra.so.14 \
libminitensor.so.14 \
libml.so.14 \
libmuelu-adapters.so.14 \
libmuelu.so.14 \
libnemesis.so.14 \
libnox.so.14 \
libnoxepetra.so.14 \
libnoxlapack.so.14 \
libpamgen-extras.so.14 \
libpamgen.so.14 \
libphalanx.so.14 \
librol.so.14 \
librtop.so.14 \
libsacado.so.14 \
libshards.so.14 \
libshylu-nodehts.so.14 \
libstokhos-amesos2.so.14 \
libstokhos-ifpack2-mp-16-openmp.so.14 \
libstokhos-ifpack2-pce-openmp.so.14 \
libstokhos-ifpack2.so.14 \
libstokhos-muelu-mp-16-openmp.so.14 \
libstokhos-muelu-pce-openmp.so.14 \
libstokhos-muelu.so.14 \
libstokhos-sacado.so.14 \
libstokhos-tpetra-mp-16-openmp.so.14 \
libstokhos-tpetra-pce-openmp.so.14 \
libstokhos-tpetra-sd-mp-16-openmp.so.14 \
libstokhos-tpetra-sd-pce-openmp.so.14 \
libstokhos-tpetra.so.14 \
libstokhos-tpetraext-mp-16-openmp.so.14 \
libstokhos-tpetraext-pce-openmp.so.14 \
libstokhos-xpetra-mp-16-openmp.so.14 \
libstokhos-xpetra-pce-openmp.so.14 \
libstokhos-xpetra.so.14 \
libstokhos.so.14 \
libstratimikos.so.14 \
libstratimikosamesos.so.14 \
libstratimikosamesos2.so.14 \
libstratimikosaztecoo.so.14 \
libstratimikosbelos.so.14 \
libstratimikosifpack.so.14 \
libstratimikosml.so.14 \
libtacho.so.14 \
libteko.so.14 \
libtempus.so.14 \
libteuchoscomm.so.14 \
libteuchoscore.so.14 \
libteuchoskokkoscomm.so.14 \
libteuchoskokkoscompat.so.14 \
libteuchosnumerics.so.14 \
libteuchosparameterlist.so.14 \
libteuchosparser.so.14 \
libteuchosremainder.so.14 \
libthyracore.so.14 \
libthyraepetra.so.14 \
libthyraepetraext.so.14 \
libthyratpetra.so.14 \
libtpetra.so.14 \
libtpetraclassic.so.14 \
libtpetraext.so.14 \
libtpetrainout.so.14 \
libtrilinos14-openmpi4 \
libtrilinoscouplings.so.14 \
libtrilinosss.so.14 \
libtriutils.so.14 \
libxpetra-sup.so.14 \
libxpetra.so.14 \
libzoltan.so.14 \
libzoltan2.so.14"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5.so.200 \
libm.so.6 \
libmpi.so.40 \
libnetcdf.so.19 \
libopenblas.so.0 \
libstdc++.so.6"

inherit rpm
