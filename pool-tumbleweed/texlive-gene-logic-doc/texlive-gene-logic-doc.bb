SUMMARY = "Documentation for texlive-gene-logic"
DESCRIPTION = "This package includes the documentation for texlive-gene-logic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-gene-logic-doc-2023.209.1.4svn15878-53.1.noarch.rpm"
RPM_HASH = "54d58bfa4767ba512060871b3a7b2cb197ba9f7edff818f324e089e51f54deda074cb8a9fec8185a1b234b18f240e3577e95b12904097bf99f1abf7f09761a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gene-logic-doc"

RDEPENDS:${PN} += ""

inherit rpm
