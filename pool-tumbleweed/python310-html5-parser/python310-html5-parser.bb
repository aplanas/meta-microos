SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.11"

RPM_NAME = "python310-html5-parser-0.4.11-1.1.aarch64.rpm"
RPM_HASH = "c13f24182f9b885a9ec1fd320963d92f67c6474fe63b2c03c3fdf7f7f1d0aed41ce4dceb1157d19a8902215c1bde3adcc18ee7cc9edc262e4fab83fe1f044a77"

RPROVIDES:${PN} += "python3.10dist-html5-parser \
python310-html5-parser \
python3dist-html5-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
python-abi"

inherit rpm
