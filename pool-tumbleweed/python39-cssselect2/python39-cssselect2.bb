SUMMARY = "CSS selectors for Python ElementTree"
DESCRIPTION = "CSSselect2 is an implementation of CSS3 Selectors for markup \
documents (HTML, XML, etc.) that can be read by ElementTree-like \
parsers (including cElementTree, lxml, html5lib, etc.) \
 \
Unlike cssselect, it does not translate selectors to XPath and therefore does \
not have all the correctness corner cases that are hard or impossible to fix in \
cssselect."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-cssselect2-0.7.0-2.1.noarch.rpm"
RPM_HASH = "c91cf0bbac755184a38b301357c3cae5de22f41f5099030d1c72859876c538fdac1636c580db1e6f79b7c7bd4c9e8fad4a885ae602274b80238879a68bea5cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssselect2 \
python39-cssselect2 \
python3dist-cssselect2"

RDEPENDS:${PN} += "python-abi \
python39-tinycss2 \
python39-webencodings"

inherit rpm
