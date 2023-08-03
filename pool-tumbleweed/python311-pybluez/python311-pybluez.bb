SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python311-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-2.1.aarch64.rpm"
RPM_HASH = "39619d035e01d4aa1ff6337696ec8dbf54604abb96a39f2a1f662dd6940d7a74102f5f0689febd372229805141b4f2bcb175a2fc95ffdf8963f67291380d1dd3"

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
