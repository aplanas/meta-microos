SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libosmcomp5-3.3.24-3.7.aarch64.rpm"
RPM_HASH = "9c02b425de61a08a78719e57032b16fac0f72949e59b9ef30eaf7df6815458f7ffe10608a96e37e87f2617ae7dfd6275361101c8c71f4efb4742e734fd4cd307"

RPROVIDES:${PN} += "libosmcomp.so.5()(64bit) \
libosmcomp.so.5(OSMCOMP_2.3)(64bit) \
libosmcomp5 \
libosmcomp5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
