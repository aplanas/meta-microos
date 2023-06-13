SUMMARY = "Documentation for texlive-betababel"
DESCRIPTION = "This package includes the documentation for texlive-betababel"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-betababel-doc-2023.201.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "0aa46cc4262b11ea02d1f7c18b66a2a1f61158e40d422e697d14c6203f01af36ae565bd0123e73eb41009932bf7ece6bad847709cfaabfe9bdde4949cc99686e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-betababel-doc"

RDEPENDS:${PN} += ""

inherit rpm
