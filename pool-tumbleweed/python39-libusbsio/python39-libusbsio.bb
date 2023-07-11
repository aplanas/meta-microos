SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python39-libusbsio-2.1.11-1.1.aarch64.rpm"
RPM_HASH = "50dad31901bdb31d17c4ccda665005af2abe808d3cb44df870f718af3b987d88d041b7e5c7adc30dec19c77d5ec0057aa152b9536b4bf2cec7f4e578ad7b767a"

RPROVIDES:${PN} += "libusbsio.so \
python3.9dist-libusbsio \
python39-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "libc.so.6 \
libudev.so.1 \
libudev.so.1-LIBUDEV-183 \
libusb-1.0.so.0 \
python-abi \
rtld-GNU-HASH"

inherit rpm
