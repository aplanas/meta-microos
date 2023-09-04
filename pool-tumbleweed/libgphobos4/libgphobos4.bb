SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libgphobos4-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "b1a7ad1d9fe55285d0607c5f4e57d6a66d32de2a45b4fdb7758952a83f05e0a4a2c1a0077e03b3a0dff8332010ffd6abc3cd69a6543daaf1142c1044c6971ce8"

RPROVIDES:${PN} += "libgphobos.so.4 \
libgphobos4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
