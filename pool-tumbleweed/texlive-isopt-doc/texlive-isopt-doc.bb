SUMMARY = "Documentation for texlive-isopt"
DESCRIPTION = "This package includes the documentation for texlive-isopt"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn45509"

RPM_NAME = "texlive-isopt-doc-2023.209.0.0.01svn45509-56.1.noarch.rpm"
RPM_HASH = "3fc2afd77c7aac0f553433ce010b52654bceffb589664a428ef23c775f590d3d0f878b59f8de95dfb0a85266c32da3a6b9ce25494b967cf5f2ae5b378d45b287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
