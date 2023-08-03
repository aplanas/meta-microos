SUMMARY = "Documentation for texlive-dk-bib"
DESCRIPTION = "This package includes the documentation for texlive-dk-bib"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-dk-bib-doc-2023.209.0.0.6svn15878-53.1.noarch.rpm"
RPM_HASH = "8fbfca7c0763a8282f9877913409f43ed408e525e85420dca13b76d25cee15e3bbd6e010245c3441f9334c856c2abc915b23a7d2b43a9847827244d4a750bba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dk-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
