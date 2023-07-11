SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python39-zstandard-0.21.0-1.3.aarch64.rpm"
RPM_HASH = "9c392e572bd2fc285481cd83174018cbb9de5b1e03b26efd4d7f37f136e91b88ab8a1bbc4d1448ccf7ab43e48cdfeed8ef608bf179ce0a3371e5236bfaea08c8"

RPROVIDES:${PN} += "python3.9dist-zstandard \
python39-zstandard \
python3dist-zstandard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi \
python39-cffi \
zstd"

inherit rpm
