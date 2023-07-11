SUMMARY = "Python 3 bindings for libpwquality"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package provides Python 3 bindings for the libpwquality library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "python3-pwquality-1.4.5-1.3.aarch64.rpm"
RPM_HASH = "3d28fd4973b6f0c879ce3ca5324fcebfa484f032cc34c19392117db66b7cbd47d8723f4435b545a6bd3711d9e3a1a074a26376a6642a78d0f0463814d5810120"

RPROVIDES:${PN} += "python-pwquality \
python3-pwquality \
python3.11dist-pwquality \
python3dist-pwquality"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpwquality.so.1 \
python-abi"

inherit rpm
