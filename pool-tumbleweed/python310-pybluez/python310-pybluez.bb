SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python310-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-2.1.aarch64.rpm"
RPM_HASH = "05a84fc0ac142b35d6a669721fd3fd93f2deb7094b87f135a504f31cfccb38329017f185f34104aaecb7655b7a4d0d00fefad872afb307baf8ffa677c959faf1"

RPROVIDES:${PN} += "pybluez \
python3.10dist-pybluez \
python310-pybluez \
python3dist-pybluez"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
python-abi"

inherit rpm
