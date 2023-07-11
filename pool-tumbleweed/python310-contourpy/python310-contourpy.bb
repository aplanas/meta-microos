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

RPM_NAME = "python310-contourpy-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "f6ba4268eb9dc1454ca9f2a1f16509cb22d4f617249fb44cfc2aef0a32fecae44ce1676a3abe6776a1f9988b401f119d531836d60048f5cb963d1e477f62d0f0"

RPROVIDES:${PN} += "python3.10dist-contourpy \
python310-contourpy \
python3dist-contourpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
