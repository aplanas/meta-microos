SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python311-cftime-1.6.2-2.1.aarch64.rpm"
RPM_HASH = "caadaa7cfe6f7c543eb823162378529160778ea95c51e9546fdf576567c284cc7e5d8db346f6f4bcbdeba7adbd41409c133ab51d1e9892d65b91f9a328d88d34"

RPROVIDES:${PN} += "python3-cftime \
python3.11dist-cftime \
python311-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Cython \
python311-numpy"

inherit rpm
