SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python310-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-1.10.aarch64.rpm"
RPM_HASH = "ab7a03f5be54749a954db3cba9f00661e9fa2c6ae33e7af688aeb5f319c0d0f4894267b9f7f3e7ef280caf6bda4c968ca48fabc9570e6155f7917bf2610549ed"

RPROVIDES:${PN} += "pybluez \
python3.10dist-pybluez \
python310-pybluez \
python3dist-pybluez"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
python-abi"

inherit rpm
