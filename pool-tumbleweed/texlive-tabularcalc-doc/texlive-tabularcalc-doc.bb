SUMMARY = "Documentation for texlive-tabularcalc"
DESCRIPTION = "This package includes the documentation for texlive-tabularcalc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-tabularcalc-doc-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "49859de21ce617fe06f2f6aeb3c5ad252c6de686e137eb103242c75161fac818be04a42b996c728adf706d5cc8e14db2649fa0e4a3912102f38a34459daea67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tabularcalc-doc:en;fr) \
texlive-tabularcalc-doc"
RDEPENDS:${PN} += ""

inherit rpm
