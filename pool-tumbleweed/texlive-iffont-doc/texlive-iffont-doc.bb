SUMMARY = "Documentation for texlive-iffont"
DESCRIPTION = "This package includes the documentation for texlive-iffont"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.0svn38823"

RPM_NAME = "texlive-iffont-doc-2023.208.1.0.0svn38823-53.1.noarch.rpm"
RPM_HASH = "d7eec80e54452ef6b0aaf84bc75cb6374fde23c282bd33d4ee51aab2d3618a8f9a62fcf71b4cf45df64a63141bf3d070863aa59944e332946aa5765f51c2c06d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iffont-doc"

RDEPENDS:${PN} += ""

inherit rpm
