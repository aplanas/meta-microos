SUMMARY = "Documentation for texlive-chemstyle"
DESCRIPTION = "This package includes the documentation for texlive-chemstyle"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0msvn31096"

RPM_NAME = "texlive-chemstyle-doc-2023.209.2.0msvn31096-54.1.noarch.rpm"
RPM_HASH = "5159c320744ad7929856b88276ed663a73e8dc65c53fdf4e6762f96fd5f85361c8871009f2871353b325b146a3b6e4a42257434e198a0b75b9198167d1803c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
