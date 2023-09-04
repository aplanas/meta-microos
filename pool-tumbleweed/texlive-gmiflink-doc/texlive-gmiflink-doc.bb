SUMMARY = "Documentation for texlive-gmiflink"
DESCRIPTION = "This package includes the documentation for texlive-gmiflink"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-doc-2023.209.0.0.97svn15878-54.2.noarch.rpm"
RPM_HASH = "b96f73ee6bfed59a4651c13017bdbba0c76d946215a2d90d572f38b1a73f580cf61f38ff18c5d6c6eb2cd01dc77fcb52fe3da8bb5221210e7574ec34ddc4def9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmiflink-doc"

RDEPENDS:${PN} += ""

inherit rpm
