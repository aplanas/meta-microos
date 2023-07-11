SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libgphobos4-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "035a26362940a22e9bf4e30fc7cf6240c3013cc3c3e92713e235553b00e684e08d8fba8854cb006b5926d4efeea1307257ca9d3ce813d03b6be088ac6b54adcc"

RPROVIDES:${PN} += "libgphobos.so.4 \
libgphobos4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
