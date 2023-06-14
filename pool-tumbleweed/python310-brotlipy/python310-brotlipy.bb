SUMMARY = "Python binding to the Brotli library"
DESCRIPTION = "This library contains Python bindings for the reference Brotli \
encoder/decoder. \
This allows Python software to use the Brotli compression algorithm \
directly from Python code."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-brotlipy-0.7.0-6.1.aarch64.rpm"
RPM_HASH = "d0975e97259d08ee41ca2fd66d11ccaf871d8b4054a37a265bebac5d92cc7bb9206abfc67914d7156fc83533e14636325db41e1faf0a75a7fd191f9dbd981aaa"

RPROVIDES:${PN} += "python3-brotlipy \
python3.10dist-brotlipy \
python310-brotlipy \
python3dist-brotlipy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
