SUMMARY = "Mesa Off-screen rendering extension"
DESCRIPTION = "OSmesa is a Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libOSMesa8-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "0bbfe6045c76a80cb30cf9437cb76174b25416e0bf3d2160e57cb617a3efe211613b6dbb7652517f8e57d38880b98252034bb47e432e7fc27b00171515e65745"

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
