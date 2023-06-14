SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-http-parser-0.9.0-1.16.aarch64.rpm"
RPM_HASH = "09e744a44e5200cf0641cd6258145e6962b7f58c52c905da9494fca236306568efa7f89e49b6fc9d04366fc2ed91c891240d0c38d054f5708a7d57c6224a4994"

RPROVIDES:${PN} += "python3-http-parser \
python3.10dist-http-parser \
python310-http-parser \
python3dist-http-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
