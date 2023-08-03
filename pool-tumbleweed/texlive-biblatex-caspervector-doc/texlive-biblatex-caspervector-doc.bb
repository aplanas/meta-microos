SUMMARY = "Documentation for texlive-biblatex-caspervector"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-caspervector"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.6svn64866"

RPM_NAME = "texlive-biblatex-caspervector-doc-2023.209.0.0.3.6svn64866-54.1.noarch.rpm"
RPM_HASH = "824eac83038b6e23e87021d35b45efc3dd884309c586acf2946a51e0a924ba9636770226d1c0abd08985e5bc7e0d7b4f90fe43160fbe2e7613e74c7e61c4600d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-caspervector-doc-zh \
texlive-biblatex-caspervector-doc"

RDEPENDS:${PN} += ""

inherit rpm
