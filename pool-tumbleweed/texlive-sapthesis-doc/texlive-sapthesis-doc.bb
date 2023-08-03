SUMMARY = "Documentation for texlive-sapthesis"
DESCRIPTION = "This package includes the documentation for texlive-sapthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1svn63810"

RPM_NAME = "texlive-sapthesis-doc-2023.209.5.1svn63810-54.1.noarch.rpm"
RPM_HASH = "87791945b3603831aa3a00bb2e03aaed48a03d45b60e535191ef25b51bdfa501167b7dee2ec043a7212682d09043b65a22158a8b7255a271bad2ff1ea1186211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sapthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
