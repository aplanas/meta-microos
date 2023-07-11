SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python39-xkbcommon-0.8-1.6.aarch64.rpm"
RPM_HASH = "1296aaa2a0218e48556a8c45ed04d0e88c4dd5fbc4d9607597a96de55978d8cedd0a13af8f23edc40fe030cb92a15e5b6afdac14611debb63cf61472d918f740"

RPROVIDES:${PN} += "python3.9dist-xkbcommon \
python39-xkbcommon \
python3dist-xkbcommon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxkbcommon.so.0 \
python-abi"

inherit rpm
