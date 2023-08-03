SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7597"

RPM_NAME = "libgphobos4-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "d91c4a17eab6f17a361ee9248d55cbb9fe1778ac9718e33de0dee4728fd5e02d2dc3ec5ecef8542770b4b39f8a7a44c35473a1c9db127dc1b33ea6164c5fe156"

RPROVIDES:${PN} += "libgphobos.so.4 \
libgphobos4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
