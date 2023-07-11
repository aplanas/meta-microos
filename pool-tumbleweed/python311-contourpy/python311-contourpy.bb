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

RPM_NAME = "python311-contourpy-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "c32d6dd883868b2f6d37bd38979c40fb7a8dbe0b0db20d3bbef689ce3bcb356f51b16bb1850824c6fd6b0e33018c93445a03adb785063be8b25f06371d02df18"

RPROVIDES:${PN} += "python3-contourpy \
python3.11dist-contourpy \
python311-contourpy \
python3dist-contourpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
