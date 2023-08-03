SUMMARY = "Documentation for texlive-tableof"
DESCRIPTION = "This package includes the documentation for texlive-tableof"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4csvn59837"

RPM_NAME = "texlive-tableof-doc-2023.209.1.4csvn59837-58.1.noarch.rpm"
RPM_HASH = "d67ad740bb0870a40585fe103e1586be2ea75c2f90340518ffcd9403f1e9d84919dbc1b5caab78b8f2472b3f3d28cd939135fd7c6715e49884a426abe215cf10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tableof-doc"

RDEPENDS:${PN} += ""

inherit rpm
