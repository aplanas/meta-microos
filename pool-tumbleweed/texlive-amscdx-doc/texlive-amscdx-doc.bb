SUMMARY = "Documentation for texlive-amscdx"
DESCRIPTION = "This package includes the documentation for texlive-amscdx"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2xsvn51532"

RPM_NAME = "texlive-amscdx-doc-2023.209.2.2xsvn51532-55.1.noarch.rpm"
RPM_HASH = "e2dff7d2fd0fb6b8e4325a46d00ece7651d0302efcf4d0c023529f79702e8b4e9bdde3256337efdbc24646eeb51d20b466ed0aefd6e81d73ab9fb8f51b643f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amscdx-doc"

RDEPENDS:${PN} += ""

inherit rpm
