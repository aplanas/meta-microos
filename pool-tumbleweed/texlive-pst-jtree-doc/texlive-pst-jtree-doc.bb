SUMMARY = "Documentation for texlive-pst-jtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-jtree"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn20946"

RPM_NAME = "texlive-pst-jtree-doc-2023.209.2.6svn20946-53.1.noarch.rpm"
RPM_HASH = "f7998f9901f857bdffc28babf18c06e4a010c8f23c5cad34770d58547bc4db6cead1769937ce2967d6edacd2e2c9bdec5a7f247a896f81fd42aa8cdd88cf9895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-jtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
