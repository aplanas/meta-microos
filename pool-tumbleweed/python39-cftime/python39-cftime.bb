SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-cftime-1.6.2-2.1.aarch64.rpm"
RPM_HASH = "08bafb10352bea8b2d6f2cb2fba3b3056ef2542732d97313b672e12aed92bcec0378a0cc75a78c3cfa77f8381062cfe8c621201a8fc2aa38044474daf5b41c3d"

RPROVIDES:${PN} += "python3.9dist-cftime \
python39-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Cython \
python39-numpy"

inherit rpm
