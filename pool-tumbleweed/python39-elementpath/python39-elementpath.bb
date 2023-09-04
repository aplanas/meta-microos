SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.5"

RPM_NAME = "python39-elementpath-4.1.5-1.1.noarch.rpm"
RPM_HASH = "34752e254b5a45c590792cb86b859649efbabc7b0698de1b4d5f8b3a235681cb41ae33e05513f599304122f6fabbb794b4a826480ef98d051f519a42c0f00ca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elementpath \
python39-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
