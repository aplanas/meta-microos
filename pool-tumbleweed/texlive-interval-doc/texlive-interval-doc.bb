SUMMARY = "Documentation for texlive-interval"
DESCRIPTION = "This package includes the documentation for texlive-interval"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4svn50265"

RPM_NAME = "texlive-interval-doc-2023.208.0.0.4svn50265-53.1.noarch.rpm"
RPM_HASH = "c8914e178aec04a66e35141c28747d28a501d3e4db2d8df8b09cfa6030920153ef83c30d7fe2e380afc486b2fa8072600569e6af074e9bae69bd9b733b8b8735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interval-doc"

RDEPENDS:${PN} += ""

inherit rpm
