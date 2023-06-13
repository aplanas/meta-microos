SUMMARY = "Documentation for Xindy"
DESCRIPTION = "Documentation for the Xindy index generator."
LICENSE = "GPL-2.0+"

PV = "2.5.1"

RPM_NAME = "xindy-doc-2.5.1-2.24.noarch.rpm"
RPM_HASH = "1a19d927009b10227f25cf34e3812685c5a4384dc64abbf0ba934f9529bf31fc808539a45058bbf1ba66c545295035741dda1fb9ecee55c8ad2a71eca52b0ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xindy-doc"

RDEPENDS:${PN} += ""

inherit rpm
