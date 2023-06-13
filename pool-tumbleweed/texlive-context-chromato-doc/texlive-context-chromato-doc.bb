SUMMARY = "Documentation for texlive-context-chromato"
DESCRIPTION = "This package includes the documentation for texlive-context-chromato"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-chromato-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "b948871276a146bd34dabae585b365bc13168c36294e5b19efc4c29568a9eeb21331e048ba664a1c43c4a7a19dfe7ac4479a9073498da92db22095b2f5d81dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-chromato-doc"

RDEPENDS:${PN} += ""

inherit rpm
