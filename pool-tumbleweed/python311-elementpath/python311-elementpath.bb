SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python311-elementpath-4.1.2-1.1.noarch.rpm"
RPM_HASH = "538e1507835802a5a7b91f5ec58b2ec860ffda008ed55a453f885cefea142770f638f0f1d7b6aa6fa00ed6feb9f81c8959e30b31978e6d568daea7cda450ccc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-elementpath \
python311-elementpath \
python3dist-elementpath"

RDEPENDS:${PN} += "python-abi"

inherit rpm
