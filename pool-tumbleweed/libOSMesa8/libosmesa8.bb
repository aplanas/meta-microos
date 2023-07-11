SUMMARY = "Mesa Off-screen rendering extension"
DESCRIPTION = "OSmesa is a Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "libOSMesa8-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "4d03855249535ecccda1ef8ddebb8b840481754962bcc23cac0a4e712b27b30fac9d816ed72976ead54b50cc32868f7dc415efc42e75c1a5222a7d26edf9165c"

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
