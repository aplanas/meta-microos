SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python310-zstandard-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "6e42c70a2e1f1dce42837183a89afd794fd9a3a2f2d75c01d69e053b65d820ce3c08adec1b513fdad81f6f414b2e7a93706936d1c5dd3647b0695472cf286911"

RPROVIDES:${PN} += "python3-zstandard \
python3.10dist-zstandard \
python310-zstandard \
python3dist-zstandard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi \
python310-cffi \
zstd"

inherit rpm
