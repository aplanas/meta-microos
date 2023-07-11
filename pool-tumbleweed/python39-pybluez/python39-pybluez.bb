SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python39-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-1.10.aarch64.rpm"
RPM_HASH = "9142974fe6f8f8dc55b45a69dd084baf548c02e2e6ea0fc5bd322b45279400acc3dac8fc030b3bc21f6b6b6289f17a006f48cc2f5d929474026a4e07b8975673"

RPROVIDES:${PN} += "pybluez \
python3.9dist-pybluez \
python39-pybluez \
python3dist-pybluez"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
python-abi"

inherit rpm
