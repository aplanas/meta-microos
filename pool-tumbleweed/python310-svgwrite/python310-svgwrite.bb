SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python310-svgwrite-1.4.3-1.5.noarch.rpm"
RPM_HASH = "7dd87e19901358ed351acf8af40dfe9c0f662d0e4a836a6adb22b8b41198aa4049b7a8f39925186deb3ffeb021bf0cc684ad07445f3b07e771160b10110b3936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-svgwrite \
python310-svgwrite \
python3dist-svgwrite"

RDEPENDS:${PN} += "python-abi \
python310-pyparsing"

inherit rpm
