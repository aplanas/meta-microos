SUMMARY = "Hdll libraries for HashLink"
DESCRIPTION = "This subpackage provides the hdll libraries for HashLink."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "hashlink-hdlls-1.13-1.4.aarch64.rpm"
RPM_HASH = "d4d37cb8b86844d80dc416cdd27de02244b54184cacdc90de188d3b961dd7a27c8fa63a69a93c1450ada79a30338f3382ba7ee770d21ee2c0c41a5e0ede66100"

RPROVIDES:${PN} += "hashlink-hdlls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libhl.so.1 \
libm.so.6 \
libpng16.so.16 \
libturbojpeg.so.0 \
libuv.so.1 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
