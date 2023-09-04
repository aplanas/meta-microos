SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.5"

RPM_NAME = "python311-elementpath-4.1.5-1.1.noarch.rpm"
RPM_HASH = "467e8aece4db3cb19dce067402ef3b1ce281ecbf90055130129dfec7a157c36a55466770e8d8370db4710e40728a3aa69aa84ee7eee21fe9d80e03f4d78b1e16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elementpath \
python3.11dist-elementpath \
python311-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
