SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python39-dist-1.0.3-3.1.aarch64.rpm"
RPM_HASH = "708b6f6bfa43a6a3d26b3c22eb649198df041b597bb473b3ac835c8439e3b6af6f198201bbc793af6dfe668be2c12431ce574dd2985aab23aace4fdf205ff483"

RPROVIDES:${PN} += "python3.9dist(dist) \
python39-dist \
python39-dist(aarch-64) \
python3dist(dist)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
