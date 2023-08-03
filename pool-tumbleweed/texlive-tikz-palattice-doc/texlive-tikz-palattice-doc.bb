SUMMARY = "Documentation for texlive-tikz-palattice"
DESCRIPTION = "This package includes the documentation for texlive-tikz-palattice"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn43442"

RPM_NAME = "texlive-tikz-palattice-doc-2023.209.2.3svn43442-53.1.noarch.rpm"
RPM_HASH = "098661c73bceb588ff41cf76df3560c4e38b02d95ffb0be42821a0dbd9d6672a21a942ebbb958a874b2211d9c33e7ad2a2fd66c9a270869766216e920a3b0a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-palattice-doc"

RDEPENDS:${PN} += ""

inherit rpm
