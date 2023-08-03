SUMMARY = "Documentation for texlive-babel-turkish"
DESCRIPTION = "This package includes the documentation for texlive-babel-turkish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn51560"

RPM_NAME = "texlive-babel-turkish-doc-2023.209.1.4svn51560-54.1.noarch.rpm"
RPM_HASH = "a44fc0e5ceb02b7cb930e78fe1713b10da34aaadc54e7898bfc219aca72c00c6b57cab466a6b42c064778ae981da076e21f76b4975c220c2af9b195830389a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-turkish-doc"

RDEPENDS:${PN} += ""

inherit rpm
