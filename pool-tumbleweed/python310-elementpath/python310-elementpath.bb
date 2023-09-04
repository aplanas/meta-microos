SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.5"

RPM_NAME = "python310-elementpath-4.1.5-1.1.noarch.rpm"
RPM_HASH = "2137d0331341e830f18192414f20411949e62d351283a005080948b449d7cb4f3e25b36f617412611e559c8a54b12ff2b5da9f03b9e90c5204da7229e1334902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-elementpath \
python310-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
