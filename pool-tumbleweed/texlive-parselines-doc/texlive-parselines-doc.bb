SUMMARY = "Documentation for texlive-parselines"
DESCRIPTION = "This package includes the documentation for texlive-parselines"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn21475"

RPM_NAME = "texlive-parselines-doc-2023.209.1.4svn21475-52.1.noarch.rpm"
RPM_HASH = "253632240f43b7d36d28d516a7664481b37c7248854fd1776d341c3c70e65d125aa9e4758626274fe1de21de9bb08b9fe31a8e997904b3646f98ebe73547b832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parselines-doc"

RDEPENDS:${PN} += ""

inherit rpm
