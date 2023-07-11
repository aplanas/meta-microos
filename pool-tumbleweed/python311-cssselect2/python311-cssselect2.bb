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

RPM_NAME = "python311-cssselect2-0.7.0-2.3.noarch.rpm"
RPM_HASH = "32de0b93739aeb40954e495f37d2c1d829d99aa7b5e9264ff550d8c68ec760a8242d34dd8f3c21851c19c11e5518625f14865ee88c388ae9fc5adcb52dc7f824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssselect2 \
python3.11dist-cssselect2 \
python311-cssselect2 \
python3dist-cssselect2"

RDEPENDS:${PN} += "python-abi \
python311-tinycss2 \
python311-webencodings"

inherit rpm
