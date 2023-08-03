SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7597"

RPM_NAME = "libgdruntime4-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "897beaa77403015e259f7f11c0090c48f746d4811b8fb45e40c9b371562a0f11fc8a7ee87d1179e5ddbb7f83d73eb3dcf87c48d34ba247e2f8943c06e64c9643"

RPROVIDES:${PN} += "libgdruntime.so.4 \
libgdruntime4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
