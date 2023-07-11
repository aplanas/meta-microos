SUMMARY = "Python binding to the Brotli library"
DESCRIPTION = "This library contains Python bindings for the reference Brotli \
encoder/decoder. \
This allows Python software to use the Brotli compression algorithm \
directly from Python code."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-brotlipy-0.7.0-6.3.aarch64.rpm"
RPM_HASH = "fecb8e6b8749472ad323c8de6e5dfa7dfe12225ced809335ffd1e9ca792cd40269e8eaa417945eb56ab97235a720d579907a333f95dfd6866c9d7fdb4d19b9db"

RPROVIDES:${PN} += "python3.9dist-brotlipy \
python39-brotlipy \
python3dist-brotlipy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
python-abi \
python39-cffi"

inherit rpm
