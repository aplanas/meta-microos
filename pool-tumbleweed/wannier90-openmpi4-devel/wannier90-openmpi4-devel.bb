SUMMARY = "Devel files for wannier90-openmpi4"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi4-devel-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "db9c267db4e0c0a0ef1a479f0e8862bee674fff72fa9e3784af7b05594b5581a80358a14e46975a5c5c711caa94fa2ca826709e8f6f13add4a47ac81fed66c6d"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi4-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
