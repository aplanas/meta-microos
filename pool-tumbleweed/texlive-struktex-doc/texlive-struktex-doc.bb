SUMMARY = "Documentation for texlive-struktex"
DESCRIPTION = "This package includes the documentation for texlive-struktex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3c_0_g7d3fc5bsvn47931"

RPM_NAME = "texlive-struktex-doc-2023.209.2.3c_0_g7d3fc5bsvn47931-58.1.noarch.rpm"
RPM_HASH = "fb96549c25cc7a44175549ce062555de9ed27e44a9bd354dbd13e1d2c8d8240968c9948d52bd1e10f64dbf127faca0668792174166de6f754f59dd5583918fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-struktex-doc-de;en \
texlive-struktex-doc"

RDEPENDS:${PN} += ""

inherit rpm
