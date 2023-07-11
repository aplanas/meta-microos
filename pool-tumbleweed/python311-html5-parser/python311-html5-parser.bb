SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.11"

RPM_NAME = "python311-html5-parser-0.4.11-1.1.aarch64.rpm"
RPM_HASH = "95b63b289e1b14b50387b76b9da4c193d311076a12daa0101a0372b9583662b925a2821e332153864fd6a9672a74b5e5fdccbc6bf0363106b8746d3025620cfc"

RPROVIDES:${PN} += "python3-html5-parser \
python3.11dist-html5-parser \
python311-html5-parser \
python3dist-html5-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
python-abi"

inherit rpm
