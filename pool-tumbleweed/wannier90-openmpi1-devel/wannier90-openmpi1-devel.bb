SUMMARY = "Devel files for wannier90-openmpi1"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi1-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "12d007415412b7306684b2d5d8167bb7327d4b9c7db38be15f723e540624ecb37a6eaf0d91cee0f646e49ac6659d29675a35fc21f2f6bc33e9ff4daee07ec4e0"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi1-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12"

inherit rpm
