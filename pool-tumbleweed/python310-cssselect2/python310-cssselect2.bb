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

RPM_NAME = "python310-cssselect2-0.7.0-2.1.noarch.rpm"
RPM_HASH = "9bcff42dcaa1dce84e95222aed61de9b3af68f995be5e333f34a6cf8fd9a03a18b878eb8d77e819669516a7b5f6cbc89d0a6a83088537eb54cef0ab65ebfb556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssselect2 \
python3.10dist-cssselect2 \
python310-cssselect2 \
python3dist-cssselect2"

RDEPENDS:${PN} += "python-abi \
python310-tinycss2 \
python310-webencodings"

inherit rpm
