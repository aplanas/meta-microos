SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python310-elementpath-4.1.4-1.1.noarch.rpm"
RPM_HASH = "e933694638d09b3d0ea46c5701e52e264d8fac01369f46eb5facbd78615937009f87b93e4a194b16a57e0f2d908bef996cc5096197f5f1d872418d987c27d309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-elementpath \
python310-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
