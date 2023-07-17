SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python311-libusbsio-2.1.11-2.1.aarch64.rpm"
RPM_HASH = "7f73423dad6b2811da43a6c19eb126853d0611ccb7fbd21dffbaafd45e716e825ace8699da354dac6619a236d1a6a85cb30d6f366f7f47ba712ec3026a3ad902"

RPROVIDES:${PN} += "libusbsio.so \
python3-libusbsio \
python3.11dist-libusbsio \
python311-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
python-abi"

inherit rpm
