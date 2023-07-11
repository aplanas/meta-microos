SUMMARY = "Intelligent predictive text entry platform (Python binding)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package provides the Python binding for libpresage. \
 \
This package contains the Python extension module for libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presage-0.9.1-13.2.aarch64.rpm"
RPM_HASH = "08206a4cf8442fa74c322486ec6e2352b4a9fd5bb79fbf07a970d8582c127eb6ec4fa10553887c112f3e738f2492623148deb965b6ee6915c067853784921a73"

RPROVIDES:${PN} += "python-presage \
python3-presage \
python3.11dist-python-presage \
python3dist-python-presage"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpresage.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
