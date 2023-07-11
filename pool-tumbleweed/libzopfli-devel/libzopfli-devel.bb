SUMMARY = "Header files for libzopfli, a gzip-compatible compressor"
DESCRIPTION = "The basic function to compress data is ZopfliCompress in zopfli.h. Use the \
ZopfliOptions object to set parameters that affect the speed and compression. \
Use the ZopfliInitOptions function to place the default values in the \
ZopfliOptions first."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopfli-devel-1.0.3-2.2.aarch64.rpm"
RPM_HASH = "5cade2a1afc109f1c0e6ce655ac9183c0907b6226e98ccd0f0cd5cb7f9dd07c688dffe0a2f0134fd3beb03123a3af08655c3db369c72e1ea2e5ffca66ea4a988"

RPROVIDES:${PN} += "cmake-Zopfli \
libzopfli-devel"

RDEPENDS:${PN} += "libzopfli1 \
libzopflipng1"

inherit rpm
