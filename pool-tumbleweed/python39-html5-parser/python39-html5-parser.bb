SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.11"

RPM_NAME = "python39-html5-parser-0.4.11-1.1.aarch64.rpm"
RPM_HASH = "2e9412e0438b07481a75c74b94f960e236131424a6c9d1ed9fb89874fa2a5fbe0ce60f03c2b8133d5453527661128732c3f4f5c4a100221faa81dd9be5b9bc15"

RPROVIDES:${PN} += "python3.9dist-html5-parser \
python39-html5-parser \
python3dist-html5-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
python-abi"

inherit rpm
