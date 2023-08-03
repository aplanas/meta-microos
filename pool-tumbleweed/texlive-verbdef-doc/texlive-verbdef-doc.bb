SUMMARY = "Documentation for texlive-verbdef"
DESCRIPTION = "This package includes the documentation for texlive-verbdef"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17177"

RPM_NAME = "texlive-verbdef-doc-2023.209.0.0.2svn17177-54.1.noarch.rpm"
RPM_HASH = "168a2474bd1d0340257a06c72c602ceb070a47595c1f3912492cf570a65a4fca26b9a1e712b69e56813336b6b3d89fc7d77cac30dca50b7eadc0683abc7c6340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
