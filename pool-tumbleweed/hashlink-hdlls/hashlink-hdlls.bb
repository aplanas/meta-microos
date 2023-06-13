SUMMARY = "Hdll libraries for HashLink"
DESCRIPTION = "This subpackage provides the hdll libraries for HashLink."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "hashlink-hdlls-1.13-1.3.aarch64.rpm"
RPM_HASH = "36032b813c4b79d237bf57c2ebb729653212cecd9dca2cf9bad3bc75b74e31b658260087378a95b970551170dbf45cee36f6841e54ced46d009b38a83ad533cc"

RPROVIDES:${PN} += "hashlink-hdlls \
hashlink-hdlls(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libhl.so.1()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libturbojpeg.so.0()(64bit) \
libuv.so.1()(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
