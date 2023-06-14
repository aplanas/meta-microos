SUMMARY = "Compute distance between two coordinates on the map"
DESCRIPTION = "As more and more apps are using maps, the more demand for geolocation capabilities increase. \
Geolocation is about the reporting of your location to other users, \
as well as associating real-world locations (such as landmarks) to your location. \
This repo helps to accurately calculate the distance between two locations \
and presents a time efficient practical solution, \
that is almost 3 times faster than similar fast pure python implementation."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python311-dist-1.0.3-3.1.aarch64.rpm"
RPM_HASH = "c29554e12b0cd96d7250ec8bd75733b30b88d98143dfeeec854e108532689f52a11cb6c3ab73289b0dec3cee65226374587465cc62d9e38892f740cf10301378"

RPROVIDES:${PN} += "python3.11dist-dist \
python311-dist \
python3dist-dist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
