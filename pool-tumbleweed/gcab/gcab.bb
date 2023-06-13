SUMMARY = "Cabinet file library and tool"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides gcab tool and its manuals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "gcab-1.5-1.5.aarch64.rpm"
RPM_HASH = "88584747cf2dd81db0f460891691d0b9c7e13b088e53c989acc3369d521e79884a878f08af8f12cb8f2f15656da99f3dce299b530237c5bb1d83200497f89dbe"

RPROVIDES:${PN} += "gcab \
gcab(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcab-1.0.so.0()(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.0)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.2)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.5)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.6)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_1.4)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
