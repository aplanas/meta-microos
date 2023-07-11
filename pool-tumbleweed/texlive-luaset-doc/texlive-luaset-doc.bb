SUMMARY = "Documentation for texlive-luaset"
DESCRIPTION = "This package includes the documentation for texlive-luaset"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65376"

RPM_NAME = "texlive-luaset-doc-2023.208.1.0svn65376-53.1.noarch.rpm"
RPM_HASH = "e97de2ef55da440a2de0167f87542e5aebed94d532fa2c014295fc312cff720a2519cc9860d4815cf0b5a9d16d09ab0ff4794178e8b04a9ffbbe524d22e1d993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaset-doc"

RDEPENDS:${PN} += ""

inherit rpm
