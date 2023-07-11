SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python39-svgwrite-1.4.3-1.5.noarch.rpm"
RPM_HASH = "6d624b1ff6eec825c32f480bbe4e1350694af545ca28e2b0cf855997795e2e74e34b43081c2ad00b741550e58441c35b9a46c5952238e765327be6a6b4570026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-svgwrite \
python39-svgwrite \
python3dist-svgwrite"

RDEPENDS:${PN} += "python-abi \
python39-pyparsing"

inherit rpm
