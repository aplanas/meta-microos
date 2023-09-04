SUMMARY = "Documentation for texlive-grant"
DESCRIPTION = "This package includes the documentation for texlive-grant"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.5svn56852"

RPM_NAME = "texlive-grant-doc-2023.209.0.0.0.5svn56852-54.2.noarch.rpm"
RPM_HASH = "a7b80254aeff6e7a4e7d0b3ccccd46f157d147d1dab4e4f8c03428ef71b7b7d0b93fef68133b8a27285a617f0fdc3b2e80ae50566983820eb72daf0241006f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grant-doc"

RDEPENDS:${PN} += ""

inherit rpm
