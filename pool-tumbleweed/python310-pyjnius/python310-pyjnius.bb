SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-pyjnius-1.4.2-2.6.aarch64.rpm"
RPM_HASH = "cc2de41824f0335016d3597c82a4236024b9188e417ce5de83925f18804940f2bad334b9c3b205c8799623d1bc95daa131c775d1c1286ff48272a4fc653f6fbc"

RPROVIDES:${PN} += "python3.10dist-pyjnius \
python310-pyjnius \
python3dist-pyjnius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Cython"

inherit rpm
