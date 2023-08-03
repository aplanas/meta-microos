SUMMARY = "Documentation for texlive-warpcol"
DESCRIPTION = "This package includes the documentation for texlive-warpcol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn15878"

RPM_NAME = "texlive-warpcol-doc-2023.209.1.0csvn15878-54.1.noarch.rpm"
RPM_HASH = "ca06515766deb1037b59f0d275fc255d933240acc2479759fa8505e3824d96f7764cafa0de1f1765b925fbfeefafb6a7c00745da01e4faf9c286c87e5179c808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-warpcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
