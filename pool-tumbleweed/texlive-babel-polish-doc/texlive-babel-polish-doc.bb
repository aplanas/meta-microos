SUMMARY = "Documentation for texlive-babel-polish"
DESCRIPTION = "This package includes the documentation for texlive-babel-polish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62680"

RPM_NAME = "texlive-babel-polish-doc-2023.209.1.3svn62680-54.1.noarch.rpm"
RPM_HASH = "4a7d0e84f9deefea550368038a5f3385d21b9208d6286b4ed45f4c0e407f3d85addbec208c1175d3b152916161c38c3a203c1af8c36bd83f53ed1041e1e31bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
