SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python39-html5-parser-0.4.10-2.10.aarch64.rpm"
RPM_HASH = "108ac7aa3dd439ab383680a7e44b8a7945bdd65283e6f57831548386a32d8f49fefa8c39de30a42f94d56614197a8d3b7d956b746b7b528630117e441a111e20"

RPROVIDES:${PN} += "python3.9dist(html5-parser) \
python39-html5-parser \
python39-html5-parser(aarch-64) \
python3dist(html5-parser)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
python(abi)"

inherit rpm
