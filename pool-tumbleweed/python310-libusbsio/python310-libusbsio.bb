SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python310-libusbsio-2.1.11-2.1.aarch64.rpm"
RPM_HASH = "95cddd6dd50615c7477b521101530c1cae685adda92253b5b9c15a0a113e69a26609d508c768dfcfa6a8957242d79e7d83fc3edb817dcd63620f0a68fe18007f"

RPROVIDES:${PN} += "libusbsio.so \
python3.10dist-libusbsio \
python310-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
python-abi"

inherit rpm
