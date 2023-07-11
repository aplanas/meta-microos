SUMMARY = "Documentation for texlive-invoice-class"
DESCRIPTION = "This package includes the documentation for texlive-invoice-class"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn49749"

RPM_NAME = "texlive-invoice-class-doc-2023.208.1.0svn49749-53.1.noarch.rpm"
RPM_HASH = "4ee5c72cf7e9d43cc2fd3ae644cc31d8c5a60d1d3caf0eaa393c1a47c8932fcf2d8bd0b89eccda7db9c4c3549bb18eba2b27e4a39995a18401194b0bfb9776a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-class-doc"

RDEPENDS:${PN} += ""

inherit rpm
