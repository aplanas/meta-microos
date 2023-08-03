SUMMARY = "Documentation for texlive-pgfmorepages"
DESCRIPTION = "This package includes the documentation for texlive-pgfmorepages"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn54770"

RPM_NAME = "texlive-pgfmorepages-doc-2023.209.1.20svn54770-52.1.noarch.rpm"
RPM_HASH = "dede8b1faa4949f12e2c27e1fadaf9d5c47bc99cf96b3dbf48b85e5e8a2a48fb5f07763f39f0b1c994bfbb987683389018bdd6c7dd5614ce0fdc3424f21cdb4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmorepages-doc"

RDEPENDS:${PN} += ""

inherit rpm
