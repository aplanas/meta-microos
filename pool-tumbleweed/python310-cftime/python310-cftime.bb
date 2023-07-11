SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-cftime-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "13061024e4960ccfc4a0c81328059685cbc6653546e64396a3e511a043f57983a338bb24cc820a95f7556e5831943ca50cf4e2f7d24ef4ae63bc34a8b31e3eea"

RPROVIDES:${PN} += "python3.10dist-cftime \
python310-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Cython \
python310-numpy"

inherit rpm
