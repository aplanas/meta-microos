SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "Apache-2.0 | MIT"

PV = "3.8.10"

RPM_NAME = "python310-orjson-3.8.10-1.1.aarch64.rpm"
RPM_HASH = "4c29da1cde8dbc19741256a3cf2b18877b0aa1b03f58b17f93fe68b715581a76a884fdb51762f203fa038cdcbf102804d622b8f55543a5ecfb33edc9505b77bd"

RPROVIDES:${PN} += "python3-orjson \
python3.10dist(orjson) \
python310-orjson \
python310-orjson(aarch-64) \
python3dist(orjson)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi)"

inherit rpm
