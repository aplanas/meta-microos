SUMMARY = "Python bindings for the OpenShot library"
DESCRIPTION = "This package provides the Python bindings for the OpenShot library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python3-openshot-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "2ac2645fbac0cb952497c36d34507b326f03efe47873e7549c6fe8417c0fffda6ff2ea60d8e8f0b443557592ace7133095a8d5e4c4dc89407360b86a0f0c33c9"

RPROVIDES:${PN} += "python3-openshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libopenshot-audio.so.9 \
libopenshot.so.24 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
