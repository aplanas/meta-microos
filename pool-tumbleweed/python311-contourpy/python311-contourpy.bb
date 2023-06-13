SUMMARY = "Python library for calculating contours of 2D quadrilateral grids"
DESCRIPTION = "A Python library for calculating contours of 2D quadrilateral grids \
 \
It contains the 2005 and 2014 algorithms used in Matplotlib as well \
as a newer algorithm that includes more features and is available \
in both serial and multithreaded versions. It provides an easy way \
for Python libraries to use contouring algorithms without having \
to include Matplotlib as a dependency."
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python311-contourpy-1.0.7-1.1.aarch64.rpm"
RPM_HASH = "58299c822ac9b0f48337922993d252682ccccfe8d839993f3632ee86820494d5cc1e56720c5efd0d4ea4403237b1739c3660c61142e96b0cd88b99daafe5c6ae"

RPROVIDES:${PN} += "python3.11dist(contourpy) \
python311-contourpy \
python311-contourpy(aarch-64) \
python3dist(contourpy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
