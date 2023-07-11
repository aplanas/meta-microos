SUMMARY = "Python binding to the Brotli library"
DESCRIPTION = "This library contains Python bindings for the reference Brotli \
encoder/decoder. \
This allows Python software to use the Brotli compression algorithm \
directly from Python code."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-brotlipy-0.7.0-6.3.aarch64.rpm"
RPM_HASH = "ebe6292416bdc6588baf7982508b64b1dc8b607f0817b2a85853f6d9907d44261e94459d8314e22f653a44c3022a75da04bd6d97421690df6b4fce7c941ea24d"

RPROVIDES:${PN} += "python3-brotlipy \
python3.11dist-brotlipy \
python311-brotlipy \
python3dist-brotlipy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
python-abi \
python311-cffi"

inherit rpm
