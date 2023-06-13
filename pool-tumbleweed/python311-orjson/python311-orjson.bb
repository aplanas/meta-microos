SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "Apache-2.0 | MIT"

PV = "3.8.10"

RPM_NAME = "python311-orjson-3.8.10-1.1.aarch64.rpm"
RPM_HASH = "af93a0edee75e1557ee273bd580426dcc63439ebc7b679947533e11e2aed18a6c6074f79edd9ab2590931f9874170cf9d3c15701fdeaf8552cbde07007f70336"

RPROVIDES:${PN} += "python3.11dist(orjson) \
python311-orjson \
python311-orjson(aarch-64) \
python3dist(orjson)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi)"

inherit rpm
