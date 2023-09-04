SUMMARY = "Suite of programs for manipulating NetCDF/HDF files"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats."
LICENSE = "BSD-3-Clause"

PV = "5.1.7"

RPM_NAME = "nco-5.1.7-1.1.aarch64.rpm"
RPM_HASH = "80a48d3d7d1fc8e6d65e49cc5f2379a96d945d81af5803bda0b87265e98ead1a81576a53f339d0115c0a1e7b36d6d8cf815ff92f42da08e1ea835829a8f82cfe"

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
libnco-5.1.7.so \
libnetcdf.so.19 \
libstdc++.so.6"

inherit rpm
