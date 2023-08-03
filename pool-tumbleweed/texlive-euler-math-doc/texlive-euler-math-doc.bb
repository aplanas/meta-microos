SUMMARY = "Documentation for texlive-euler-math"
DESCRIPTION = "This package includes the documentation for texlive-euler-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.31svn65685"

RPM_NAME = "texlive-euler-math-doc-2023.209.0.0.31svn65685-53.1.noarch.rpm"
RPM_HASH = "6cf9b48f88260fe6db7532e0d388ce70177426b07e9a4377209d18df06cde633954ca069bb55d71321ed1563f324216e8a4b57ad2d7b22777b697203f65dbe5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euler-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
