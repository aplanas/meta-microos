SUMMARY = "Devel files for wannier90-openmpi4"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi4-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "cb233f91fc4400754c09789628803f063de165c7a8f9a22408bb4156cd2520afea57fc76741bdff06a494f5fedc19c7ccc47ac583790294920e156f74f13e690"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi4-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
