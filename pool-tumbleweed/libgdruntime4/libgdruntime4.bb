SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libgdruntime4-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "255f4378fd0b3526df808a46e7fc215f13c4b87d3f0a8aacfe0748da746973b2732452c0ad2cc47fb72066e2b7f4bc45078d46063302c683565825e172de7c2f"

RPROVIDES:${PN} += "libgdruntime.so.4 \
libgdruntime4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
