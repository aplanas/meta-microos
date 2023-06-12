SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.7"

RPM_NAME = "python39-alsa-1.2.7-2.4.aarch64.rpm"
RPM_HASH = "24700095510d45aede84cfcf7c36fe3438d80882c44255e3bcafaa083c2be4239e63ccb5e475dd14b5a1243563adb0e1a4387ba74dc90daaa7d7b2f461301a97"

RPROVIDES:${PN} += "pyalsa \
python3.9dist(pyalsa) \
python39-alsa \
python39-alsa(aarch-64) \
python3dist(pyalsa)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.3)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
