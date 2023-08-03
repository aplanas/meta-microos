SUMMARY = "Documentation for texlive-pst-labo"
DESCRIPTION = "This package includes the documentation for texlive-pst-labo"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.04svn39077"

RPM_NAME = "texlive-pst-labo-doc-2023.209.2.04svn39077-53.1.noarch.rpm"
RPM_HASH = "26a9476c951a25be9502f1330f6f06ae60d9af95f950d627db95319bf6da3647c6744136b145f7b3617dc4d66ad4075b144ce0ac732c33974189ee5480ff5a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-labo-doc"

RDEPENDS:${PN} += ""

inherit rpm
