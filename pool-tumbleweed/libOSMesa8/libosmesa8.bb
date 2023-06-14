SUMMARY = "Mesa Off-screen rendering extension"
DESCRIPTION = "OSmesa is a Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libOSMesa8-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "e69abdf59a9aad43bd570af8c5faf6f307952abbf48e6f64ae2cec0f65a2203c6914417ae32c66f79fcffb8edb15d06e7de588e05b4234454e42beeb08d26561"

RPROVIDES:${PN} += "libOSMesa.so.8 \
libOSMesa8 \
libOSMesa9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglapi.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
