SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python310-dist-1.0.3-3.3.aarch64.rpm"
RPM_HASH = "02373fd6595aaaf40fd263666f451e062c71f6309aa75105d1f678f09025448284ab3973002850d736ae48dc52909110c9fd7e3c5a60fef9fbfe3aad2e9cd945"

RPROVIDES:${PN} += "python3.10dist-dist \
python310-dist \
python3dist-dist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
