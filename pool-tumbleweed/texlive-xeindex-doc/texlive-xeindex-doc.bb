SUMMARY = "Documentation for texlive-xeindex"
DESCRIPTION = "This package includes the documentation for texlive-xeindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-doc-2023.209.0.0.3svn35756-53.2.noarch.rpm"
RPM_HASH = "d7f4fc59b7bda09df5f7ae6e47be7987fea8a4b2b9a922cba0bc3482ed193eca75e93ad0643b1fc3a1edaf3c7b22e6435f486ccb714c28cce6adf6f4798901be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xeindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
