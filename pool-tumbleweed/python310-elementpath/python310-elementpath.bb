SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python310-elementpath-4.1.2-1.1.noarch.rpm"
RPM_HASH = "ef1c4d10dcf844ad02eb6aa4df44ed1bee258d4fdaa49614550bae5f6ca1508758d9ac51112cefdffead8359b18249db8aef3b725177d4cdc6bf437d2302c103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elementpath \
python3.10dist(elementpath) \
python310-elementpath \
python3dist(elementpath)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
