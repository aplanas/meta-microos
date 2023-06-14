SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20220611"

RPM_NAME = "libuna1-mini-20220611-4.2.aarch64.rpm"
RPM_HASH = "eb0f872b93b59fd8484493bc868bb5753e763e082a0347fbc2dda00c485fcae2c082b0fd88fe92e0bef74b5436538b43b6d071d42891a9c10ccca620983f55da"

RPROVIDES:${PN} += "libuna.so.1 \
libuna1-mini"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
