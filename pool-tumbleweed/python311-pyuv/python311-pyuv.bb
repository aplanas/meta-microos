SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-pyuv-1.4.0-6.1.aarch64.rpm"
RPM_HASH = "d1c3a175db2c97eb51bb717008aae6e7dc046dd17beddb1a4750cd56d5b9101c112a9c22832b21e7923c0aafb4b657448a6c143ac4f8227e8a66c7174aa7525a"

RPROVIDES:${PN} += "python3-pyuv \
python3.11dist-pyuv \
python311-pyuv \
python3dist-pyuv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
