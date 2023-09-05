SUMMARY = "Mesa Off-screen rendering extension"
DESCRIPTION = "OSmesa is a Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "libOSMesa8-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "95428b4198d77f93375c24751f636d56ac736131cd4ebb14ade737df98a2ed17e2bdccb99cee1fdfd620daa95c68491e458e6b6540f43c18a027c7e9dc93713c"

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
