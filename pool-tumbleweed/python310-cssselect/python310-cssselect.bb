SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python310-cssselect-1.2.0-2.1.noarch.rpm"
RPM_HASH = "1b9fb45f3a53cf10f32542c7c2043819f3e20066e2bb7bdbf473e0f6ebc2e375e46dd2925cfdbe76bc7acb8d443741c78b3d8724239b70e11864deaf0914b1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssselect \
python3.10dist-cssselect \
python310-cssselect \
python3dist-cssselect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
