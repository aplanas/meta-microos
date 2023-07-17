SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7552"

RPM_NAME = "libgphobos4-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "b06fe2d277a9424b644010ef097d5cc21c67b2ca8c0f66a72d4129522c9fba0ebdbcef7ccad56e88d6a412012ca5d94b113bb031292456b12f5aebc71e686d42"

RPROVIDES:${PN} += "libgphobos.so.4 \
libgphobos4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
