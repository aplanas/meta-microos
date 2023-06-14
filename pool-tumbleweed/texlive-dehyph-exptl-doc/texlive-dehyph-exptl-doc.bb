SUMMARY = "Documentation for texlive-dehyph-exptl"
DESCRIPTION = "This package includes the documentation for texlive-dehyph-exptl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn66390"

RPM_NAME = "texlive-dehyph-exptl-doc-2023.201.0.0.9svn66390-52.1.noarch.rpm"
RPM_HASH = "198dc302af74ef50b9485a80331894bfd5c48e20a5113f98711241807a500a9ee1bec76681090252b397604d4941ceee022b613f991d3b52b215ab835acd1e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dehyph-exptl-doc-de \
texlive-dehyph-exptl-doc"

RDEPENDS:${PN} += ""

inherit rpm
