SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python310-zstandard-0.21.0-1.3.aarch64.rpm"
RPM_HASH = "9f44963288cfba427129ac7312a90e3ffaaed611848b37d0013a99b09705f4654428cbfe8d779a125c15d1e31c5f012b9437da580dfd7c4ec7f8cf5b27764cf6"

RPROVIDES:${PN} += "python3.10dist-zstandard \
python310-zstandard \
python3dist-zstandard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi \
python310-cffi \
zstd"

inherit rpm
