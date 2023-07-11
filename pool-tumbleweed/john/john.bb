SUMMARY = "Utility to detect weak passwords"
DESCRIPTION = "John the Ripper is a password cracker (password security auditing \
tool). Its primary purpose is to detect weak passwords, and a \
number of other hash types are supported to that end."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "john-1.9.0-9.7.aarch64.rpm"
RPM_HASH = "e0f3e545835e90f753d6bb66e25a7557b1d63fc8b8a8bb332d17e3057d05d37cfada6fe04d93ff6292835a65d9fe039e4cef0e6f0c3319ed8b6f1337d0628b56"

RPROVIDES:${PN} += "config-john \
john"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgmp.so.10 \
libm.so.6 \
libpcap.so.1 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
