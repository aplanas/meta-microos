SUMMARY = "Hdll libraries for HashLink"
DESCRIPTION = "This subpackage provides the hdll libraries for HashLink."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "hashlink-hdlls-1.13-1.3.aarch64.rpm"
RPM_HASH = "36032b813c4b79d237bf57c2ebb729653212cecd9dca2cf9bad3bc75b74e31b658260087378a95b970551170dbf45cee36f6841e54ced46d009b38a83ad533cc"

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
