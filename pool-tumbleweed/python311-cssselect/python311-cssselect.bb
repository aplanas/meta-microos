SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python311-cssselect-1.2.0-2.2.noarch.rpm"
RPM_HASH = "56b2f94ec16f34b249371cc468c192bb040eda0de6c8f01be852c05e973873f078d91d4b10e384b9aa88ebe3aa7a11648cf06cbd496cfc54c2cae7d4cbecb5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssselect \
python3.11dist-cssselect \
python311-cssselect \
python3dist-cssselect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
