SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-cftime-1.6.2-2.1.aarch64.rpm"
RPM_HASH = "2cd8b3aae0d62a2bcde1130d669827d9f40a8668c0a8dddba7657e0fb872de1971412558f00e0d2acd1eb9ebb759a8f7b40653bb68d1a929f02373aa9ffa6d0f"

RPROVIDES:${PN} += "python3.10dist-cftime \
python310-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Cython \
python310-numpy"

inherit rpm
