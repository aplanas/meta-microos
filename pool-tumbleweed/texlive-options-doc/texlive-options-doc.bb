SUMMARY = "Documentation for texlive-options"
DESCRIPTION = "This package includes the documentation for texlive-options"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39030"

RPM_NAME = "texlive-options-doc-2023.209.1.0svn39030-55.1.noarch.rpm"
RPM_HASH = "54bb1314f86de1d53764ca0e9b8a98edad5b22fd86e5bdb60155320bc1a064c0dcd7f5b4020d646a32b81e81d6eb68233c8dda5b0d5008aba351841cd346d468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-options-doc"

RDEPENDS:${PN} += ""

inherit rpm
