SUMMARY = "Documentation for texlive-droit-fr"
DESCRIPTION = "This package includes the documentation for texlive-droit-fr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn39802"

RPM_NAME = "texlive-droit-fr-doc-2023.201.1.2svn39802-52.1.noarch.rpm"
RPM_HASH = "02dc61ff7ac727e02ca572b3053d3b361e7a5391dda9b3e9d26411208a4dc64cb33ed008b4a7919c218ea7de248214525e2401458d32f1573e12a6c5f6cf7ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-droit-fr-doc:fr) \
texlive-droit-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
