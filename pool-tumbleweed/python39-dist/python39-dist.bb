SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python39-dist-1.0.3-3.3.aarch64.rpm"
RPM_HASH = "408c0ee35b179eed3649b861596ed7bc08fa6091c780d4edfad4fb8d6fcefa2caa8191373aad1748ec35563cf6cc3fb585369f32381a57a5e84e77173d9ca97e"

RPROVIDES:${PN} += "python3.9dist-dist \
python39-dist \
python3dist-dist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
