SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python39-elementpath-4.1.2-1.1.noarch.rpm"
RPM_HASH = "8fb9a9e73816003d1313aed9a2f1c73398b1112eab8a66941b81afc26360f44cde49247d84966ea5c6a136b360b9ac0b57bde63e721be431c3c1421293be9359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(elementpath) \
python39-elementpath \
python3dist(elementpath)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
