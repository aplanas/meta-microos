SUMMARY = "Documentation for texlive-realhats"
DESCRIPTION = "This package includes the documentation for texlive-realhats"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63595"

RPM_NAME = "texlive-realhats-doc-2023.209.6.0svn63595-54.2.noarch.rpm"
RPM_HASH = "34663f02fd4323f095e70b25ffa43dbe214dc4036c1836220ccaa0eab295862a3a99fb7795073f4f8284d435db3381871fb72057a6e6a71a9035b962dd645e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realhats-doc"

RDEPENDS:${PN} += ""

inherit rpm
