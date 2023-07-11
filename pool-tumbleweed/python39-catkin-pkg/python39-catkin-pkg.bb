SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "0.4.24"

RPM_NAME = "python39-catkin-pkg-0.4.24-2.11.noarch.rpm"
RPM_HASH = "f46f84693932893c1687a40dca5d1d17515fdd6f3d96e74ae498198d8c935fc948ada947c9cc650905d19e873592c2a8dcca399026e18cc592f70924805e93d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-catkin-pkg \
python39-catkin-pkg \
python3dist-catkin-pkg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
python39-pyparsing \
python39-python-dateutil \
python39-setuptools \
update-alternatives"

inherit rpm
