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

RPM_NAME = "python39-contourpy-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "5a318300177be4c4abd9bd09174366bf9790d5b97793048be40aa6415263e861f9c3cc4c42c7802e0bc8acee289f53390e7b67edbdf5c8eb3efcc5284443545d"

RPROVIDES:${PN} += "python3.9dist-contourpy \
python39-contourpy \
python3dist-contourpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
