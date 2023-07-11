SUMMARY = "Python bindings for the OpenShot library"
DESCRIPTION = "This package provides the Python bindings for the OpenShot library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "python3-openshot-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "9bdaf9e738294b9500674d755fe5ae7037b8cba4fcbad2c9b0ae05720688d7d96c1197f611d20c72f6e2bd28499129f922065b6a03b2c38e59b77deeeb718929"

RPROVIDES:${PN} += "python3-openshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libopenshot-audio.so.9 \
libopenshot.so.25 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
