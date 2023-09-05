SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libgphobos4-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "a8d18912b037bab951af0f51bfec406782184b89a008e5d780956367b62dc9dd40daa949e3b886c623998cc07b0761d77e7f3d514010fcc4af9cc8b82dbb3894"

RPROVIDES:${PN} += "libgphobos.so.4 \
libgphobos4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
