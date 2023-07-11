SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python311-zstandard-0.21.0-1.3.aarch64.rpm"
RPM_HASH = "a9168256de810973218c22ae028f38566ac731afff6e3d293582b361f96270ac0ac323bbc0ed4151eb76a93d15c341989f5cca6bbe167d3a1f7f0482e403ad80"

RPROVIDES:${PN} += "python3-zstandard \
python3.11dist-zstandard \
python311-zstandard \
python3dist-zstandard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi \
python311-cffi \
zstd"

inherit rpm
