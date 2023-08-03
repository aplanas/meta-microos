SUMMARY = "Documentation for texlive-droit-fr"
DESCRIPTION = "This package includes the documentation for texlive-droit-fr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn39802"

RPM_NAME = "texlive-droit-fr-doc-2023.209.1.2svn39802-53.1.noarch.rpm"
RPM_HASH = "15b961f220abe61c8944cd0160422f32b6b625024ef5af41649fffc35c7c622c87746682c67f10ed9aff81034ab1689ae3e8fec100c0198eb9851e5caa433e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-droit-fr-doc-fr \
texlive-droit-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
