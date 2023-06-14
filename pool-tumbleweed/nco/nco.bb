SUMMARY = "Suite of programs for manipulating NetCDF/HDF files"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "nco-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "37f548bfe8aec122073524c41e43e98f04c61ac53535ebc2adce68727030dacb5227f7f2ad7111e31142837171ac29c397d62ff7aa4ba12834492395c5130f43"

RPROVIDES:${PN} += "nco"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/env \
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
