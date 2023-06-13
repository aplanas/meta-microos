SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python311-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-1.8.aarch64.rpm"
RPM_HASH = "f0b30011219d36f33b13716abefbd0f25eb49241bda887fd1c684adae5466f4aee3514c2da97addcf7c7c2e236f9a6ea7a7e0283ec9febf0195208922436b80e"

RPROVIDES:${PN} += "pybluez \
python3.11dist(pybluez) \
python311-pybluez \
python311-pybluez(aarch-64) \
python3dist(pybluez)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
