SUMMARY = "Python binding to the Brotli library"
DESCRIPTION = "This library contains Python bindings for the reference Brotli \
encoder/decoder. \
This allows Python software to use the Brotli compression algorithm \
directly from Python code."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-brotlipy-0.7.0-6.3.aarch64.rpm"
RPM_HASH = "def4c43ee516d755ee3e38fa3e7425e233eb754e2fb530d45dbb0e34f82a69e6f1872aac2224b8c0176ca1f63ec40608a3c2521098f1af728dfdfe0eb37666c5"

RPROVIDES:${PN} += "python3.10dist-brotlipy \
python310-brotlipy \
python3dist-brotlipy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
