SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-pyuv-1.4.0-7.1.aarch64.rpm"
RPM_HASH = "7b81ba0f4b87998721ea6c3049c6da9d0ac2f5f41d852fd61f8bec05c96bd461e2191b3e7321760e2afdaa11050093ee8e5d964d67f6de4c43e4470d8891caee"

RPROVIDES:${PN} += "python3.9dist-pyuv \
python39-pyuv \
python3dist-pyuv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
