SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.5.1"

RPM_NAME = "python310-zstd-1.5.5.1-1.3.aarch64.rpm"
RPM_HASH = "b6c92cd7bbea4d3dba08acda3f7ed348b94fbaf4ee8ac2de0d8d5e04430d6d2dbfafbcde8d39f42b69fde89c2dc7918c9cdf1efd875fc342be224be30e6dc438"

RPROVIDES:${PN} += "python3.10dist-zstd \
python310-zstd \
python3dist-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
