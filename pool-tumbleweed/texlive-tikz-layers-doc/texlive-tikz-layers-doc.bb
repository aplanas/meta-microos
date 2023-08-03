SUMMARY = "Documentation for texlive-tikz-layers"
DESCRIPTION = "This package includes the documentation for texlive-tikz-layers"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn46660"

RPM_NAME = "texlive-tikz-layers-doc-2023.209.0.0.9svn46660-53.1.noarch.rpm"
RPM_HASH = "08953f6c2e93d0e0f50b1e29b34c1eb7df22a139f1f97875d2f415ec02b678e6a1f97be120ee988f2d21c28b7479e671151e3b5ea4a8b757f2747773289adee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-layers-doc"

RDEPENDS:${PN} += ""

inherit rpm
