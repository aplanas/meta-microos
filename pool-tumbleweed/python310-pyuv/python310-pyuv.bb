SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-pyuv-1.4.0-6.1.aarch64.rpm"
RPM_HASH = "b1bca1d90a421dbc13e455214fc9c342279b8dc2f39f7744f08c7d535e3eed3c86e9806547667dbfc1fe4adf4ff9cb4b26f1d769d82fdc7ba792d81653d89717"

RPROVIDES:${PN} += "python3.10dist-pyuv \
python310-pyuv \
python3dist-pyuv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
