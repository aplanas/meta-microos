SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python310-svgwrite-1.4.3-1.3.noarch.rpm"
RPM_HASH = "29bf5a40034e562b3bbc4da60de582c499075ac2c2185ffd4e8f27e7fd5c0b78642763f03a5e63638abeedd6c8e7247db7d8417a9cb63cacf38b0ee305fc794a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svgwrite \
python3.10dist-svgwrite \
python310-svgwrite \
python3dist-svgwrite"

RDEPENDS:${PN} += "python-abi \
python310-pyparsing"

inherit rpm
