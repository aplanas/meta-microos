SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20230702"

RPM_NAME = "libuna1-20230702-1.1.aarch64.rpm"
RPM_HASH = "ab28a0316251dc9116a99820de750e2b37070ca7cf60878c91b763c30fe670207646b2f6a091de1cedccb79babf1fc9c0c34ff0110cdf2b5ddfb8b3537d852f1"

RPROVIDES:${PN} += "libuna.so.1 \
libuna1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
