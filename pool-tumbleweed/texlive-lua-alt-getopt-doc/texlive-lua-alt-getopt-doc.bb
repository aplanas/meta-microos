SUMMARY = "Documentation for texlive-lua-alt-getopt"
DESCRIPTION = "This package includes the documentation for texlive-lua-alt-getopt"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.7.0svn56414"

RPM_NAME = "texlive-lua-alt-getopt-doc-2023.208.0.0.7.0svn56414-53.1.noarch.rpm"
RPM_HASH = "337d89f5843ca9ac2d147b89eeb0a0ce9c7e503447b57bd5f918ee6ce09c033f14dc4fd574aa59909772286abc5393780851b3cd3bae456a90b2e7b588f103dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-alt-getopt-doc"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh"

inherit rpm
