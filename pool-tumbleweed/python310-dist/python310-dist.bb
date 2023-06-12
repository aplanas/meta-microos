SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python310-dist-1.0.3-3.1.aarch64.rpm"
RPM_HASH = "e04b511ed701a1a70bb643b1389fcf19b742fdca23f74c3b3969e0d8f156d4998bddfaa93424e397adb9ec3de0dff53fdc0e61b613923c53557fcedffec5324b"

RPROVIDES:${PN} += "python3-dist \
python3.10dist(dist) \
python310-dist \
python310-dist(aarch-64) \
python3dist(dist)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
