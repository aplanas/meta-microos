SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python311-dist-1.0.3-3.3.aarch64.rpm"
RPM_HASH = "fd80a00af4ce5d37724f33a6159569d66559020c7833505bcfe02a982cde2bd2085afd6d124b830a213f5987e057e68a1e80519fad975c116bcad2e6b346ec8f"

RPROVIDES:${PN} += "python3-dist \
python3.11dist-dist \
python311-dist \
python3dist-dist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
