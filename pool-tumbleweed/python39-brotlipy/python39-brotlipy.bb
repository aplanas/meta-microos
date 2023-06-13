SUMMARY = "Python binding to the Brotli library"
DESCRIPTION = "This library contains Python bindings for the reference Brotli \
encoder/decoder. \
This allows Python software to use the Brotli compression algorithm \
directly from Python code."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-brotlipy-0.7.0-6.1.aarch64.rpm"
RPM_HASH = "052e58b3f3a584fc32cd3176866c9f94654b46eac3eca8a6caec27295919f484bcfadbe8022911ea8e8373d1b49b62a141e26e9506febe820267c8017ecca53a"

RPROVIDES:${PN} += "python3.9dist(brotlipy) \
python39-brotlipy \
python39-brotlipy(aarch-64) \
python3dist(brotlipy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-cffi"

inherit rpm
