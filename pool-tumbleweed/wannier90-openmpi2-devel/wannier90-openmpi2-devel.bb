SUMMARY = "Devel files for wannier90-openmpi2"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi2-devel-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "c18a508eeddc98fb71b2c59275c7b2075ff8d4bea6eb12d9e3c7d763ad6a504e2b4cfd36d6b6866a45b090675bdabb5e82cb0a647b620cd9bc98018717d93d30"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi2-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20"

inherit rpm
