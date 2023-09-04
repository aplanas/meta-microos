SUMMARY = "Documentation for texlive-pst-text"
DESCRIPTION = "This package includes the documentation for texlive-pst-text"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn49542"

RPM_NAME = "texlive-pst-text-doc-2023.209.1.02svn49542-54.2.noarch.rpm"
RPM_HASH = "cbd3d7228d59c6be8523ba55e87b705fbcd7e6680157e6147be3c3f5f2be5bce8e8231cd9c47020a64412182d6b1bf76c4c6c4c7e9fc67ed117088c059c02792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
