SUMMARY = "Python 3 bindings for libpwquality"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package provides Python 3 bindings for the libpwquality library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "python3-pwquality-1.4.5-1.2.aarch64.rpm"
RPM_HASH = "a3029ffe5a9bdf891f1bbcf636bd53488c60e7784d506bb72e145d8a188b0e6b0a2d28121cdc9212708dc0b2dcea1255c88ef4f5f0c34ea7aeeedb565f6499ee"

RPROVIDES:${PN} += "python-pwquality \
python3-pwquality \
python3-pwquality(aarch-64) \
python3.10dist(pwquality) \
python3dist(pwquality)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpwquality.so.1()(64bit) \
libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) \
python(abi)"

inherit rpm
