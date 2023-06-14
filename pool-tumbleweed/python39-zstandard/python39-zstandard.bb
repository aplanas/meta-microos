SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python39-zstandard-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "1ee19977255758a6621e7003c87eb96c64d24f90969e98eebcc51f55cb215628bf732b842bc3112e5f278ee6cb206d169a2435cc505cbf1777038d46ec8d763f"

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
