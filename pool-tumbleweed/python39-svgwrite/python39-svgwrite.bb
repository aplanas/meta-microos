SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python39-svgwrite-1.4.3-1.3.noarch.rpm"
RPM_HASH = "1c60378b076bfc20ce494ed432d3b40d6899f91159831de1bf6d8bf7d6481cdb2c964955048c8b2abe89c0425ae5f9a587bad6272f0e3b01023355cf2ce0b72e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-svgwrite \
python39-svgwrite \
python3dist-svgwrite"

RDEPENDS:${PN} += "python-abi \
python39-pyparsing"

inherit rpm
