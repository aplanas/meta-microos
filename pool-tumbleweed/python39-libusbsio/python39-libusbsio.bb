SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python39-libusbsio-2.1.11-2.1.aarch64.rpm"
RPM_HASH = "1c22adf509e7dc65ca7c1e13714f9e7494ca4a9566fe308a1ca540f0bb13e3d6171e6c3e0fdea57a9c8829dce2a86a300b31dcf3a14484e12089a546f42a844b"

RPROVIDES:${PN} += "libusbsio.so \
python3.9dist-libusbsio \
python39-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
python-abi"

inherit rpm
