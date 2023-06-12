SUMMARY = "Documentation for texlive-tikz-3dplot"
DESCRIPTION = "This package includes the documentation for texlive-tikz-3dplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25087"

RPM_NAME = "texlive-tikz-3dplot-doc-2023.201.svn25087-54.1.noarch.rpm"
RPM_HASH = "104a6529eff2497859a638db151788b5a47e1cf9ab6022c2ba26698d2637b773ee7e5b908b0bc5edc6b9f76972cbe5acb495093b5e539ecffd5b0a7562ec8d6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-3dplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
