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

RPM_NAME = "python310-cssselect2-0.7.0-2.3.noarch.rpm"
RPM_HASH = "92e529ac1c024e0b24e73dd590159890627056453c93605ec50fd634ab96462937ae520460816dbcc23e606ee62bf1186d95e894b2655152bc43fe902671138a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cssselect2 \
python310-cssselect2 \
python3dist-cssselect2"

RDEPENDS:${PN} += "python-abi \
python310-tinycss2 \
python310-webencodings"

inherit rpm
