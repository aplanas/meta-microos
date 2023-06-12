SUMMARY = "Documentation for texlive-mathexam"
DESCRIPTION = "This package includes the documentation for texlive-mathexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn15878"

RPM_NAME = "texlive-mathexam-doc-2023.201.1.00svn15878-52.1.noarch.rpm"
RPM_HASH = "c354b9e4546900813660ce9e308c5040c3f672045b1d777ad212034c33633aba4fde859df655497d5a304569f3045868498d8701ee4c3a11b6fb72136488b762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathexam-doc"
RDEPENDS:${PN} += ""

inherit rpm
