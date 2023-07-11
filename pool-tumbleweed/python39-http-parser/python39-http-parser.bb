SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-http-parser-0.9.0-1.18.aarch64.rpm"
RPM_HASH = "b97e54734694cb781ad1d8b851ee4d103125ea3e44f301d392dab01dc8795c123955fc113eeaac391a05ea0cdeece446843ad911c2c886ad90a98b587e6a1ad3"

RPROVIDES:${PN} += "python3.9dist-http-parser \
python39-http-parser \
python3dist-http-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
