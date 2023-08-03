SUMMARY = "Documentation for texlive-exp-testopt"
DESCRIPTION = "This package includes the documentation for texlive-exp-testopt"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-exp-testopt-doc-2023.209.0.0.3svn15878-53.1.noarch.rpm"
RPM_HASH = "4c4b29efb56930146d5dfc4040d6c7e2a78c7106dd14bf22a056cfb3800085431ac5e0679ddcc12493eb9485b4e58131d9958e885bdd279d634c1812c5ac6c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-exp-testopt-doc-en;eo \
texlive-exp-testopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
