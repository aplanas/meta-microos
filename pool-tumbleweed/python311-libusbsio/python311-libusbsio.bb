SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python311-libusbsio-2.1.11-1.1.aarch64.rpm"
RPM_HASH = "f9f81d8588178973582e1bc29f9b88120a8c4fb8a8bc637d25bd522cf51bf59ca9e1e62b1467e8be6bc0752b8e68995f5f6ccb9f012ce43389951cf1c846403f"

RPROVIDES:${PN} += "libusbsio.so \
python3-libusbsio \
python3.11dist-libusbsio \
python311-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "libc.so.6 \
libudev.so.1 \
libudev.so.1-LIBUDEV-183 \
libusb-1.0.so.0 \
python-abi \
rtld-GNU-HASH"

inherit rpm
