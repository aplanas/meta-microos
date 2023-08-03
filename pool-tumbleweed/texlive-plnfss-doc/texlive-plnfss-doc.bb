SUMMARY = "Documentation for texlive-plnfss"
DESCRIPTION = "This package includes the documentation for texlive-plnfss"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-plnfss-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "a96186373f0954757c11939e92c299b36533a9a66148807445611f57e07171751dadb96b757a4f384adff53f7a412268838be473505289fb83a9239e15257775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
