SUMMARY = "Documentation for texlive-xmltex"
DESCRIPTION = "This package includes the documentation for texlive-xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn62145"

RPM_NAME = "texlive-xmltex-doc-2023.209.0.0.8svn62145-53.1.noarch.rpm"
RPM_HASH = "e85fe788bddfc933f09797fde18a3af0a16fc9a5692394e6a6ec762cb595149e7cc0b6a5cc50876a0397e5067faf003908df3810738b660a07a0a0e86a1a1725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
