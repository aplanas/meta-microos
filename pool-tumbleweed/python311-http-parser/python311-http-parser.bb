SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-http-parser-0.9.0-1.18.aarch64.rpm"
RPM_HASH = "a94fceb63b7fd2bed015b58a9b65e1f5ed44de62d86ae1ca4a7b74e5992ad0fd74118859d0656ad73a8372d1a9dfd30e5470445df71aee0b6ff5522db6a12f02"

RPROVIDES:${PN} += "python3-http-parser \
python3.11dist-http-parser \
python311-http-parser \
python3dist-http-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
