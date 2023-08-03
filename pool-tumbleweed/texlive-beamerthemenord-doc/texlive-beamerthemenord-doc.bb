SUMMARY = "Documentation for texlive-beamerthemenord"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemenord"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn56180"

RPM_NAME = "texlive-beamerthemenord-doc-2023.209.0.0.2.0svn56180-54.1.noarch.rpm"
RPM_HASH = "a39b3c354abdd38e25773365e223246ed524c650bdf1f5a313d67fd808f192659d96b1ac6db14fa44a7ebb2cb1d1f18ed92da0c315e211ae30a2abe17d839f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemenord-doc"

RDEPENDS:${PN} += ""

inherit rpm
