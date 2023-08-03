SUMMARY = "Documentation for texlive-bxwareki"
DESCRIPTION = "This package includes the documentation for texlive-bxwareki"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn51286"

RPM_NAME = "texlive-bxwareki-doc-2023.209.0.0.6svn51286-53.1.noarch.rpm"
RPM_HASH = "26c8c8754f8411f8a4de67188dff7853bb985616dfc4b8a9f440e0f71f4ee8a07e1d9cae28878d36eab362a657a301f39a2947e947a7febc2405ead2cd6b8a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxwareki-doc"

RDEPENDS:${PN} += ""

inherit rpm
