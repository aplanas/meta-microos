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

RPM_NAME = "python310-contourpy-1.0.7-1.1.aarch64.rpm"
RPM_HASH = "c21c960ba8903836c771e9650cf0760ec7f44ab35d0677b22075141f43e291ea5fd686e32dcb130dc38dd0b32d56fb30dbb65e4bee7ee8979d1f702dd73c9b41"

RPROVIDES:${PN} += "python3-contourpy \
python3.10dist(contourpy) \
python310-contourpy \
python310-contourpy(aarch-64) \
python3dist(contourpy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
