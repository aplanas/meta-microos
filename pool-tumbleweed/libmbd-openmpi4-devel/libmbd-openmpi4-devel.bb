SUMMARY = "Many-body dispersion library -- headers and sources"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C. \
 \
This package provides the files needed for developing against libmbd-openmpi4."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-openmpi4-devel-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "29db4f00739c2887ac16d0c0fac183a05bc5f2652454f090fc35f63780136943ffe4bd63efec67b4757baaae60dae8b38ba6a118d7113c28ca27eab1c5ad77c1"

RPROVIDES:${PN} += "libmbd-openmpi4-devel"

RDEPENDS:${PN} += "libmbd-openmpi4 \
scalapack-openmpi4-devel"

inherit rpm
