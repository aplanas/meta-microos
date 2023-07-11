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

RPM_NAME = "python311-netCDF4-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "d8ee01fc0a668243b5bbcd27072f0106284c71bde3f49134e8bf719beaaad7a396925167699e58c88a555ca8544a5bb46ff2845a3823557eadd9062b8eeb13a6"

RPROVIDES:${PN} += "python3-netCDF4 \
python3.11dist-netcdf4 \
python311-netCDF4 \
python3dist-netcdf4"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf.so.19 \
netcdf \
python-abi \
python311-cftime \
python311-numpy \
update-alternatives"

inherit rpm
