SUMMARY = "Mesa Off-screen rendering extension"
DESCRIPTION = "OSmesa is a Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libOSMesa8-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "85cb774f24018cab91d953014a0718979c7cf1b042d254eded38d55ae8584f6128abbe0ba7688dfe88c994643e23bf7b687778b9beb4237a69bcc243a022d472"

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
