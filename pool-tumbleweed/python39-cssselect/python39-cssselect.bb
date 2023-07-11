SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python39-cssselect-1.2.0-2.2.noarch.rpm"
RPM_HASH = "42508dcba1a3ff238d07125c3a3ee9f46c52d795c694b1f712be6286166e7890c15d87443ea0662694b2fa38c9e6df951709754d88e9b699c10a51ad0fd72c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssselect \
python39-cssselect \
python3dist-cssselect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
