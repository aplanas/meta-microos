SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python39-elementpath-4.1.4-1.1.noarch.rpm"
RPM_HASH = "3929809883846d536e90746bcbfde035cbda1249feff60e0a1bc04c9b01708e88d99a757cbd743bcd8bddcbe189954b835c58f52f332c6c68bd4f40d5871c3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elementpath \
python39-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
