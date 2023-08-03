SUMMARY = "Documentation for texlive-disser"
DESCRIPTION = "This package includes the documentation for texlive-disser"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.0svn43417"

RPM_NAME = "texlive-disser-doc-2023.209.1.5.0svn43417-53.1.noarch.rpm"
RPM_HASH = "54a3197cad8d636258880f6463f648888c68df257b44389def1353a6d9e24b3aafec9d46ecb62f49b9f73f362f4d948dad60308de423a22f0e903d7ae6a139a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-disser-doc-ru;en \
texlive-disser-doc"

RDEPENDS:${PN} += ""

inherit rpm
