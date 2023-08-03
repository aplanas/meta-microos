SUMMARY = "Documentation for texlive-qualitype"
DESCRIPTION = "This package includes the documentation for texlive-qualitype"
LICENSE = "OFL-1.1"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-qualitype-doc-2023.209.svn54512-54.1.noarch.rpm"
RPM_HASH = "9d71c76774fecb6c2baf8ae5d9f3eabe2bb327b2152d1dd3d7521a5c1f3d006f9834aa12c37a643b3915c7d8e74f27102048bc45899d8c1e3aa08ac530cb1e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype-doc"

RDEPENDS:${PN} += ""

inherit rpm
