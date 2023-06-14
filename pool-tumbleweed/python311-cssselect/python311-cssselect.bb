SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python311-cssselect-1.2.0-2.1.noarch.rpm"
RPM_HASH = "3ce03665ef17d1c5a3319f29a044491a038c549dad7c14add144f77be5f85e2efd09906227771dbebcd3d0bf169a78f70cb48480cea2c1996ef17bba838121cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cssselect \
python311-cssselect \
python3dist-cssselect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
