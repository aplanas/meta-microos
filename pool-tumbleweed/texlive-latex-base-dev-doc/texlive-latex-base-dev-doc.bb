SUMMARY = "Documentation for texlive-latex-base-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-base-dev"
LICENSE = "LPPL-1.0"

PV = "2023.209.20230601_pre_release_2svn66513"

RPM_NAME = "texlive-latex-base-dev-doc-2023.209.20230601_pre_release_2svn66513-56.1.noarch.rpm"
RPM_HASH = "c31ded59e8a41aae65e76897e4a3bffbaca699555dae6969aa4f537f3db320293cfa1932ed10989e42dba387b70e1ca1c81eaf637ce7cd52b8699bfb07e0b9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-base-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
