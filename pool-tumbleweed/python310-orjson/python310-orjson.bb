SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "Apache-2.0 | MIT"

PV = "3.8.10"

RPM_NAME = "python310-orjson-3.8.10-2.3.aarch64.rpm"
RPM_HASH = "7e9b273476ba8fdd8eb8faad93313c64cc5e4f2f0209e9d61ae4190cf9c41cdcc1868152c1f61e019bb0c1ca8fe74efc431fc6445bbfc9bc117aa4be66fd56b3"

RPROVIDES:${PN} += "python3.10dist-orjson \
python310-orjson \
python3dist-orjson"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
