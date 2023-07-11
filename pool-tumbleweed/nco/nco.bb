SUMMARY = "Suite of programs for manipulating NetCDF/HDF files"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "nco-5.1.4-1.6.aarch64.rpm"
RPM_HASH = "94198364bff2ed9d8b9353436e1ecb65a0cde10614449e540ddda8ad1606d2f690a7348eaae78e70f7eeb6a59270dd49dfb864c8f1abbafb71a0d0193065687b"

RPROVIDES:${PN} += "nco"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.27 \
libm.so.6 \
libnco-5.1.4.so \
libnetcdf.so.19 \
libstdc++.so.6"

inherit rpm
