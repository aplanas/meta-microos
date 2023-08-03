SUMMARY = "Documentation for texlive-coseoul"
DESCRIPTION = "This package includes the documentation for texlive-coseoul"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn23862"

RPM_NAME = "texlive-coseoul-doc-2023.209.1.1svn23862-55.1.noarch.rpm"
RPM_HASH = "82faa76fc583ae735d1160c198ca24360b98d696b144d7ebdf63ab95a39a92be50529ffefd188bc9292ac2cbea08e56946ded40571542ccf4a7e285bbb642f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coseoul-doc"

RDEPENDS:${PN} += ""

inherit rpm
