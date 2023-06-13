SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python311-zstandard-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "3c6d428c4cc2e13e17649f7ef044c3b80633e0a4f5ae10ece9e45559bd98f7e17dc77501445800a200f38d150a9ce4dcdab301bb7c7c2b5483776b93c138c569"

RPROVIDES:${PN} += "python3.11dist(zstandard) \
python311-zstandard \
python311-zstandard(aarch-64) \
python3dist(zstandard)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libzstd.so.1()(64bit) \
python(abi) \
python311-cffi \
zstd"

inherit rpm
