SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python39-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-2.1.aarch64.rpm"
RPM_HASH = "a635144e09e81ac3cd1dc3919a3173dcb124288ac711c37433835b302c0029b92906f9e9b0ef09ef807d7005e51ba542396aed0a321579ee67d6334fd33798e9"

RPROVIDES:${PN} += "pybluez \
python3.9dist-pybluez \
python39-pybluez \
python3dist-pybluez"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
python-abi"

inherit rpm
