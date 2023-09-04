SUMMARY = "Documentation for texlive-wrapfig2"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig2"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-doc-2023.209.6.1.1svn66115-53.2.noarch.rpm"
RPM_HASH = "e486a0090526e76aaa610e48d31e394a353bd5b05b929e985c03e01d52aabe2545940ce0a6b739c4edfd608e536e053fc58a52e109aed189d51f6b3008e7ebf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig2-doc"

RDEPENDS:${PN} += ""

inherit rpm
