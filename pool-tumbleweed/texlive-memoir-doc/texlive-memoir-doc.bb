SUMMARY = "Documentation for texlive-memoir"
DESCRIPTION = "This package includes the documentation for texlive-memoir"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.7.19svn65040"

RPM_NAME = "texlive-memoir-doc-2023.208.3.7.19svn65040-53.1.noarch.rpm"
RPM_HASH = "3fd2e6c4fd9eb17d934e4c3bb68d89d534228c122041dd6e1482696b518fbba5ab90eea4e4998bdfdc0c8b578057dae25527cc98fb6553dd70ab7375eff35da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memoir-doc"

RDEPENDS:${PN} += ""

inherit rpm
