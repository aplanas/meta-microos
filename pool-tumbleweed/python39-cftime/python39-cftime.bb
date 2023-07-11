SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-cftime-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "2fb83c8c92549d89a7a7e6be754a5b6a40e26076a8550fde77233398890056570f023e296b9efdc053e10d3f9967b2ac4da86a90d85a47ddb661346353c4b313"

RPROVIDES:${PN} += "python3.9dist-cftime \
python39-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Cython \
python39-numpy"

inherit rpm
