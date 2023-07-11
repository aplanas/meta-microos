SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "Apache-2.0 | MIT"

PV = "3.8.10"

RPM_NAME = "python311-orjson-3.8.10-2.3.aarch64.rpm"
RPM_HASH = "ee1c7275c6cbafc6df2033aba0235ec51aacdabc9ea730df89b8d0fbddfdd60f19c5997d0bec2b4635c3c97e792c8031e039a0d17744178f7cbbd136f032f045"

RPROVIDES:${PN} += "python3-orjson \
python3.11dist-orjson \
python311-orjson \
python3dist-orjson"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
