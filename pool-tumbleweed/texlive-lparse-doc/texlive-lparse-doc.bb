SUMMARY = "Documentation for texlive-lparse"
DESCRIPTION = "This package includes the documentation for texlive-lparse"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn65693"

RPM_NAME = "texlive-lparse-doc-2023.201.0.0.1.0svn65693-54.1.noarch.rpm"
RPM_HASH = "984d80a8b7147762d8cd8b0c1d3e2a42486f2fae6cacf539c06ed13247ca6a51b4ef73c4ede3e6d78e86317d28a12b351651ca56b27587c656f0de74a1f20dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lparse-doc"

RDEPENDS:${PN} += ""

inherit rpm
