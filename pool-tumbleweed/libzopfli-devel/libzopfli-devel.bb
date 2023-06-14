SUMMARY = "Header files for libzopfli, a gzip-compatible compressor"
DESCRIPTION = "The basic function to compress data is ZopfliCompress in zopfli.h. Use the \
ZopfliOptions object to set parameters that affect the speed and compression. \
Use the ZopfliInitOptions function to place the default values in the \
ZopfliOptions first."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopfli-devel-1.0.3-2.1.aarch64.rpm"
RPM_HASH = "22cad6f258927b23cee2a5f7ff56cf055d597095a8c13cee04856ba71b71e50b8ba13da97f4427f83d34e31b6c31fd819c21c70e6d5cfee19a3040748d28903b"

RPROVIDES:${PN} += "cmake-Zopfli \
libzopfli-devel"

RDEPENDS:${PN} += "libzopfli1 \
libzopflipng1"

inherit rpm
