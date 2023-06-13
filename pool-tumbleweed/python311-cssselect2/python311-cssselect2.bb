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

RPM_NAME = "python311-cssselect2-0.7.0-2.1.noarch.rpm"
RPM_HASH = "7860a5cb88ca15231b6f61e73be09c3855d462e9d47c8edfd19f91fb463060378815827ff25bcd0471bf667744ccbbfa772ba0d23f9bcf468266aa15c66a54c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cssselect2) \
python311-cssselect2 \
python3dist(cssselect2)"

RDEPENDS:${PN} += "python(abi) \
python311-tinycss2 \
python311-webencodings"

inherit rpm
