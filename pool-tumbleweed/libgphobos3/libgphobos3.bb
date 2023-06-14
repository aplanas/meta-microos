SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "12.3.0+git1204"

RPM_NAME = "libgphobos3-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "38f31883a7678860fcab3b36298e113286a30f35d21a92f2f10d9cfa339dfeaccb723787959f0429b7f0b9d4fc3a28d8873dd454fdaf252097234b47ebc96527"

RPROVIDES:${PN} += "libgphobos.so.3 \
libgphobos3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
