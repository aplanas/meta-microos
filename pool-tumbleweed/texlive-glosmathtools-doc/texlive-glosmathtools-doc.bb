SUMMARY = "Documentation for texlive-glosmathtools"
DESCRIPTION = "This package includes the documentation for texlive-glosmathtools"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-doc-2023.201.1.0.0svn55920-53.2.noarch.rpm"
RPM_HASH = "4549bbc5cca024eb45458b96a65802e4f64c5be8c2e9df3a1e724a25ed412137aa99c70332c605671ab01d0841204a431869c0656b41bed1c3ddef254e92093e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-glosmathtools-doc-fr \
texlive-glosmathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
