SUMMARY = "Documentation for texlive-datetime2-slovene"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-slovene"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52282"

RPM_NAME = "texlive-datetime2-slovene-doc-2023.209.1.1svn52282-53.1.noarch.rpm"
RPM_HASH = "20c7813deb5051830dd5ee9a329928a6b8640ecf97aba75bbda09a8a1e7f73df7946bfc907ec4080f1fa3f36f8e0975148c58f1b0f4983a06264f48a9aae6fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
