SUMMARY = "Documentation for texlive-variations"
DESCRIPTION = "This package includes the documentation for texlive-variations"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-variations-doc-2023.201.0.0.3svn15878-53.1.noarch.rpm"
RPM_HASH = "dd94ca9f95cf113898509f9dc875a18eb5c307e25f9862ab1f28cfb4902e02919e088caa4c750108fef952ab19fcbb8b146caa98ca1608abb48d4ebb042cedc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-variations-doc-fr;en \
texlive-variations-doc"

RDEPENDS:${PN} += ""

inherit rpm
