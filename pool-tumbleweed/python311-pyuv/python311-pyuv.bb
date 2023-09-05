SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-pyuv-1.4.0-7.1.aarch64.rpm"
RPM_HASH = "2c13557e1b99b20d9f99b1e1d413966755fe630f10b5116e7e93435fbefc463be08e969517b37dd3d4ed644cb75848607c409b5d17bc3b896d8791de776dab94"

RPROVIDES:${PN} += "python3-pyuv \
python3.11dist-pyuv \
python311-pyuv \
python3dist-pyuv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
