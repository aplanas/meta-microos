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

PV = "3.5.0"

RPM_NAME = "python310-pyproj-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "422a3f5ecb9c73e3a7b0a842de85d6440437ae72ce227aa3acbe4053eabfc01c5b63b2eb15df91486f9340962e6bedf868da79308b2a0ebff6190077f1b663bf"

RPROVIDES:${PN} += "python3-pyproj \
python3.10dist-pyproj \
python310-pyproj \
python3dist-pyproj"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libproj.so.25 \
python-abi \
python310-certifi \
update-alternatives"

inherit rpm
