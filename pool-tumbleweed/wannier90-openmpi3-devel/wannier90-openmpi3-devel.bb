SUMMARY = "Devel files for wannier90-openmpi3"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi3-devel-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "8c288c82599f98a1c8ac1fd2582a247f7e26ffb31c4cb6c4534b38dcb786163e3e7e41e29ce4c1dcb9a3bb7aa12cf7267c40ae4bf1ee8d76cd4eb92d064da440"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi3-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
