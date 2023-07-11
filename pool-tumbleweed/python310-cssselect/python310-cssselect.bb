SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python310-cssselect-1.2.0-2.2.noarch.rpm"
RPM_HASH = "ebb9256c8a1418af4c75c7a10012152a21e2c55d92e7c611977f583f901a1b69a7943f00395a162db2cb1c3b0ade9a242d525053f4ec1981e37be1928337d70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cssselect \
python310-cssselect \
python3dist-cssselect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
