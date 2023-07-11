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

RPM_NAME = "python310-netCDF4-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "c6dd5e96b3f361b6c0f3536f2e50e71719832e23b624c6319ca50e39fd020a4ce89c0cc82d293db19bca16d1387c12d2cfdbc921cffbd26c510379309056556c"

RPROVIDES:${PN} += "python3.10dist-netcdf4 \
python310-netCDF4 \
python3dist-netcdf4"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
hdf5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetcdf.so.19 \
netcdf \
python-abi \
python310-cftime \
python310-numpy \
update-alternatives"

inherit rpm
