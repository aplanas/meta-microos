SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-cftime-1.6.2-1.5.aarch64.rpm"
RPM_HASH = "bf314c65c68105c5239e4ee114c3c535fcb589e72b59240a60db52f6b969a5683f20335799384e94fcb3b3e88e6bf56b43aba9a7c1dc39b7eb8f9748d5c09b83"

RPROVIDES:${PN} += "python3-cftime \
python3.10dist-cftime \
python310-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Cython \
python310-numpy"

inherit rpm
