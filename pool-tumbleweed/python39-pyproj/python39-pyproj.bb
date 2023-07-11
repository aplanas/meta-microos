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

RPM_NAME = "python39-pyproj-3.6.0-1.3.aarch64.rpm"
RPM_HASH = "0b9ecff4046cc31403d4e509c69d268e57c098b4214dd6001f19ba188a451fbe2f16471f07ef87529f388f5fc2fcd94b6051705762d5c23283d8e56980892b9c"

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
