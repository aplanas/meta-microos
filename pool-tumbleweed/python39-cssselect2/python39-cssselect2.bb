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

RPM_NAME = "python39-cssselect2-0.7.0-2.3.noarch.rpm"
RPM_HASH = "e23241b601a72610d2ad96db5f3d0f5c16c740ea9cce4d56a4bc48b3d9955f92340aafd60864545bb90496fb9007c5c3a66b44db24f64938a5cc2f7ad99552ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssselect2 \
python39-cssselect2 \
python3dist-cssselect2"

RDEPENDS:${PN} += "python-abi \
python39-tinycss2 \
python39-webencodings"

inherit rpm
