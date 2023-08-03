SUMMARY = "Mesa Off-screen rendering extension"
DESCRIPTION = "OSmesa is a Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libOSMesa8-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "b363143f009a55e0cee3c24d89a536fcb87c7580fd049e6ac69756d51df8db6a1c59cc9fd8c49daa72042c4b74d1c236590a04c12b013d50c2554a3c45270a76"

RPROVIDES:${PN} += "libOSMesa.so.8 \
libOSMesa8 \
libOSMesa9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libgcc-s.so.1 \
libglapi.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
