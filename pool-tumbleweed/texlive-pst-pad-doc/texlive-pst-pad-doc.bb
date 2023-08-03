SUMMARY = "Documentation for texlive-pst-pad"
DESCRIPTION = "This package includes the documentation for texlive-pst-pad"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3bsvn15878"

RPM_NAME = "texlive-pst-pad-doc-2023.209.0.0.3bsvn15878-53.1.noarch.rpm"
RPM_HASH = "138a4727d6599856f076ac568d6f74eb8c0519cbf3f84f4c0d1e8185fc6c28c7ba755d775a22692c3d77ddd3fa54a3932f70c16861df44482f91d3ec700b219d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-pad-doc-en;de \
texlive-pst-pad-doc"

RDEPENDS:${PN} += ""

inherit rpm
