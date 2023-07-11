SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python310-immutables-0.19-3.1.aarch64.rpm"
RPM_HASH = "1afb88fe49b69b41e5dd7babfe4704ffab8537206b9ff2216633024b3bfefa42f7ad17072dcfc2b8c37dccf53b3cc235140234542316ccc041da8f02d1d72708"

RPROVIDES:${PN} += "python3.10dist-immutables \
python310-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
