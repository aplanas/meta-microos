SUMMARY = "Documentation for texlive-context-simplefonts"
DESCRIPTION = "This package includes the documentation for texlive-context-simplefonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-simplefonts-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "f8dff9386356ce2eafb4b2ff72ec81602b582f6592fa53b834c291541ca4a43e7e1c88edf5162fcea9fffc183592f0bcef908fce57ec48a01711399c676ec0e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-simplefonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
