SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python311-elementpath-4.1.4-1.1.noarch.rpm"
RPM_HASH = "98e3b1686ec47ce47c862150ed01a4f929d9b8b947381b29d9d8d34ec1e986e74878aaee32b4b6eb87c2c54f4d98b6ec7f2305aa802838de136c79b0f52f758b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elementpath \
python3.11dist-elementpath \
python311-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
