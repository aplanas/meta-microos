SUMMARY = "Documentation for texlive-xetex-devanagari"
DESCRIPTION = "This package includes the documentation for texlive-xetex-devanagari"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-doc-2023.201.0.0.5svn34296-52.1.noarch.rpm"
RPM_HASH = "521420e3d1c65e13fe638b333e2d64b70233220d04f16c4b668891f97859873102f832ffbdcd211c70811bc68b7a2a90b4b292da6ca3958ef5ea717efef662fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-devanagari-doc"
RDEPENDS:${PN} += ""

inherit rpm
