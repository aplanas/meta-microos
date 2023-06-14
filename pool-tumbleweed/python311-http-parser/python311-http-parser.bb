SUMMARY = "HTTP Request/Response Parser for Python in C"
DESCRIPTION = "HTTP request/response parser for Python in C, based on \
http-parser from Ryan Dahl."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-http-parser-0.9.0-1.16.aarch64.rpm"
RPM_HASH = "dc1301490e4fdcfc7ba6c82a436ed6d549af43659e7035a9497f82e7a78ab786007d8221492b228a1d0a15cd5dc864ccee59a4f25e801f5abd69ad0ab1895aa5"

RPROVIDES:${PN} += "python3.11dist-http-parser \
python311-http-parser \
python3dist-http-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
