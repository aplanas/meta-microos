SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-http-parser-0.9.0-1.18.aarch64.rpm"
RPM_HASH = "55c53d5a71305a0d34572e3e35b6b0bb3493575679f6630a07cde58616951578217cc78c258c79a512996b2d517a6e5f666729f6fa797e0d5291c6ec54f15044"

RPROVIDES:${PN} += "python3.10dist-http-parser \
python310-http-parser \
python3dist-http-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
