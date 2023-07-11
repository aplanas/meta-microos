SUMMARY = "Documentation for texlive-pst-tree"
DESCRIPTION = "This package includes the documentation for texlive-pst-tree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.14svn60421"

RPM_NAME = "texlive-pst-tree-doc-2023.201.1.14svn60421-53.2.noarch.rpm"
RPM_HASH = "fe547062160631521af2038b95eaca2b69ac1519755944c4a8c8960c283223c1017e1b511ec50035aa66f174904b96dfbcbed1113399e679526ef2067446b849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-tree-doc-en \
texlive-pst-tree-doc"

RDEPENDS:${PN} += ""

inherit rpm
