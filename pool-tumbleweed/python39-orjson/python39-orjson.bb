SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "Apache-2.0 | MIT"

PV = "3.8.10"

RPM_NAME = "python39-orjson-3.8.10-2.3.aarch64.rpm"
RPM_HASH = "fe1feef3e480c1d7957892af17084971cfc1c470053399e5888e831fe243cdd729a0cc284a872a355de486034407deed60df39e91a65ce97f8dcc9477da5915d"

RPROVIDES:${PN} += "python3.9dist-orjson \
python39-orjson \
python3dist-orjson"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
