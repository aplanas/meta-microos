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

RPM_NAME = "python311-pyproj-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "8c0c6121894412a260960e3570fd10f679eb879144affec9eeae6d3c830fbb9b6a440918986d072054b42d56694968a7ceff203306ae745bf98cf4f2af9816d2"

RPROVIDES:${PN} += "python3.11dist(pyproj) \
python311-pyproj \
python311-pyproj(aarch-64) \
python3dist(pyproj)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libproj.so.25()(64bit) \
python(abi) \
python311-certifi \
update-alternatives"

inherit rpm
