SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python311-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-1.10.aarch64.rpm"
RPM_HASH = "fa9f3b47eef682df4962fea6b86983eb61c53214d669f880502b22269784788d14231b2c25e375758989e826b4d2f7c11cebcbb52d3969d8646c72fdbbd5dc24"

RPROVIDES:${PN} += "pybluez \
python3-pybluez \
python3.11dist-pybluez \
python311-pybluez \
python3dist-pybluez"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
python-abi"

inherit rpm
