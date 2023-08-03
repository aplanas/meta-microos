SUMMARY = "Documentation for texlive-yaletter"
DESCRIPTION = "This package includes the documentation for texlive-yaletter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42830"

RPM_NAME = "texlive-yaletter-doc-2023.209.1.1svn42830-53.1.noarch.rpm"
RPM_HASH = "909d62634f0d273e7f050729644737aea016d6166d90349c8fcf3eb924fe82ca9e9398089c353785316991d74f4f6e7888d156530e21e342d0c421c1ab154395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yaletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
