SUMMARY = "Documentation for texlive-hc"
DESCRIPTION = "This package includes the documentation for texlive-hc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-hc-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "b693202f32e1dbd7c4fc9c1cc3d3ef427b5e88b8271888b69142961b72f094079287e5327b4cb07f6910dfb168d3b484b9164fb130296486f588f8e76c809f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hc-doc"

RDEPENDS:${PN} += ""

inherit rpm
