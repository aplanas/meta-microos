SUMMARY = "Documentation for texlive-yplan"
DESCRIPTION = "This package includes the documentation for texlive-yplan"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34398"

RPM_NAME = "texlive-yplan-doc-2023.209.svn34398-53.1.noarch.rpm"
RPM_HASH = "5686fde6834571baab897fb0dc45235b83a2a9cb0da1eddb11ef79f031ea66f47f826c113ef2b32df9a5619db43ef05a8708f0fe25ac11cf2e92d50048b1c144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yplan-doc"

RDEPENDS:${PN} += ""

inherit rpm
