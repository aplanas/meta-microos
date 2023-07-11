SUMMARY = "Python interface to netCDF 3 and 4"
DESCRIPTION = "netCDF version 4 has many features not found in earlier versions of \
the library and is implemented on  top of HDF5. This module can read \
and write files in both the new netCDF 4 and the old netCDF 3 \
format, and can create files that are readable by HDF5 clients. The \
API modelled after Scientific.IO.NetCDF, and should be familiar to \
users of that module. \
 \
Most new features of netCDF 4 are implemented, such as multiple unlimited \
dimensions, groups and zlib data compression. All the new numeric data types \
(such as 64 bit and unsigned integer types) are implemented. Compound and \
variable length (vlen) data types are supported, but the enum and opaque data \
types are not. Mixtures of compound and vlen data types (compound types \
containing vlens, and vlens containing compound types) are not supported."
LICENSE = "HPND & MIT"

PV = "1.6.2"

RPM_NAME = "python39-netCDF4-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "453049b2235e89a8076b433e6c3e4c6f25d3fb21452000796f74e1c6a2903f3e7e505df4da673ef6a5ae7a131cda13f4ac6670054c2093acc9d249f7b0f8dd48"

RPROVIDES:${PN} += "python3.9dist-netcdf4 \
python39-netCDF4 \
python3dist-netcdf4"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf.so.19 \
netcdf \
python-abi \
python39-cftime \
python39-numpy \
update-alternatives"

inherit rpm
