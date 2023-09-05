SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-splash-core library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-core5-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "9c205405f5b85b90e4c5dfc5c75428ab2cc21859b961827ca819b0a38410c57fa20acf0eb60e4236c9d2e71d0d2c3a57da1c3bdb9ac2e4fb9aed92ba1c870f95"

RPROVIDES:${PN} += "libply-splash-core.so.5 \
libply-splash-core5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply.so.5 \
libudev.so.1"

inherit rpm
