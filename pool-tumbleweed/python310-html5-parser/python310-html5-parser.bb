SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python310-html5-parser-0.4.10-2.10.aarch64.rpm"
RPM_HASH = "19f963c1dceecf1c6ffde82158515864f44ab1eac00c183b2c02a991a302c5dc119c652230d212b7d22306fb05770f9c2b8a8912b811d5e14156792d3b035c9f"

RPROVIDES:${PN} += "python3-html5-parser \
python3.10dist(html5-parser) \
python310-html5-parser \
python310-html5-parser(aarch-64) \
python3dist(html5-parser)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
python(abi)"

inherit rpm
