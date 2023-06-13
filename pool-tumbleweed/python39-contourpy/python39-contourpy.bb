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

RPM_NAME = "python39-contourpy-1.0.7-1.1.aarch64.rpm"
RPM_HASH = "af7b0dcf2a5f0f700cac442a7e088a776c8ae039b7e89bdf22c73a3d18cda68e89835de68c184964d7b99d1b9f1c34b52fe7f6f6e7c75cf462e30b775223da8c"

RPROVIDES:${PN} += "python3.9dist(contourpy) \
python39-contourpy \
python39-contourpy(aarch-64) \
python3dist(contourpy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
