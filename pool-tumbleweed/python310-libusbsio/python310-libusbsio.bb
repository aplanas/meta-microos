SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python310-libusbsio-2.1.11-1.1.aarch64.rpm"
RPM_HASH = "475c0b253ffe0f1e4e9960aae9c69e45b0c9cd6f0c0c0e2ee810cff9e295d4749b20653b58082ae4d96bdb0eebf0e882a096ae4a5cae4a787277227c1c9c019a"

RPROVIDES:${PN} += "libusbsio.so \
python3.10dist-libusbsio \
python310-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "libc.so.6 \
libudev.so.1 \
libudev.so.1-LIBUDEV-183 \
libusb-1.0.so.0 \
python-abi \
rtld-GNU-HASH"

inherit rpm
