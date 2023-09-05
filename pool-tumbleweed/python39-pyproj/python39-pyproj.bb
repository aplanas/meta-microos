SUMMARY = "Python interface to PROJ library"
DESCRIPTION = "Performs cartographic transformations and geodetic computations. \
 \
The Proj class can convert from geographic (longitude,latitude) to native map \
projection (x,y) coordinates and vice versa, or from one map projection \
coordinate system directly to another. \
 \
The Geod class can perform forward and inverse geodetic, or Great Circle, \
computations. The forward computation involves determining latitude, longitude \
and back azimuth of a terminus point given the latitude and longitude of an \
initial point, plus azimuth and distance. The inverse computation involves \
determining the forward and back azimuths and distance given the latitudes and \
longitudes of an initial and terminus point. \
 \
Input coordinates can be given as python arrays, lists/tuples, scalars or \
numpy/Numeric/numarray arrays. Optimized for objects that support the Python \
buffer protocol (regular python and numpy array objects). \
 \
This project has a git repository https://github.com/pyproj4/pyproj \
where you may access the most up-to-date source."
LICENSE = "SUSE-Public-Domain & X11"

PV = "3.6.0"

RPM_NAME = "python39-pyproj-3.6.0-2.1.aarch64.rpm"
RPM_HASH = "aaac4a0113d43d62ee6daf90be1991e5ccf019901edcde974c834f1b21f133d4441b699f3ac790f8f343c1145e8e1bb2e6ed60dfdca30ff17c4e2743a53b8cb1"

RPROVIDES:${PN} += "python3.9dist-pyproj \
python39-pyproj \
python3dist-pyproj"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libproj.so.25 \
python-abi \
python39-certifi \
update-alternatives"

inherit rpm
