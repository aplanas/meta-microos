SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "0.4.24"

RPM_NAME = "python310-catkin-pkg-0.4.24-2.11.noarch.rpm"
RPM_HASH = "ca325606f0c730cf7a1f1af76e27d02cfec5cfe98a1bfab7aa16832ff2b4fd438c51f4a064a425a5854c3dee72115023fa260805de40066b98323861486f7b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-catkin-pkg \
python310-catkin-pkg \
python3dist-catkin-pkg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
python310-pyparsing \
python310-python-dateutil \
python310-setuptools \
update-alternatives"

inherit rpm
