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

RPM_NAME = "python311-pyproj-3.6.0-1.3.aarch64.rpm"
RPM_HASH = "9f2ae0e13c74744ccc0c83d427ba9b04e453da176ae1c9ead29c93834866f054682fb840cf0db809a50cc1d0208b2a9a71d9959de500d348c218f5fef81836e3"

RPROVIDES:${PN} += "python3-pyproj \
python3.11dist-pyproj \
python311-pyproj \
python3dist-pyproj"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libproj.so.25 \
python-abi \
python311-certifi \
update-alternatives"

inherit rpm
