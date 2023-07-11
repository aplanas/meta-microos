SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python310-cffi-1.15.1-4.3.aarch64.rpm"
RPM_HASH = "1e08cb98247f86889b6160fd7d2dfda1cfb1e1453750d01a91359b8f1ba4bc2527e700acc9f3e641b870140748c9af7a200e1e5807ec999a8458e41c23c1490a"

RPROVIDES:${PN} += "python3.10dist-cffi \
python310-cffi \
python3dist-cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
python-abi \
python310-pycparser"

inherit rpm
