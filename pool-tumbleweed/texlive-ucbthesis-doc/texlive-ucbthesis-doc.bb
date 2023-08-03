SUMMARY = "Documentation for texlive-ucbthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucbthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn51690"

RPM_NAME = "texlive-ucbthesis-doc-2023.209.3.6svn51690-53.1.noarch.rpm"
RPM_HASH = "70f9562f4e7e07645542eee9849480c9367dc1779f7aeef36bb3b317c64708f0060e416df300820f09be2f808ffcd89619974dd54f7e36527ca68029a9615b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucbthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
