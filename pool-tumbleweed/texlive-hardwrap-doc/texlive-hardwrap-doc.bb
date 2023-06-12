SUMMARY = "Documentation for texlive-hardwrap"
DESCRIPTION = "This package includes the documentation for texlive-hardwrap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-doc-2023.201.0.0.2svn21396-53.1.noarch.rpm"
RPM_HASH = "fbadd7fb7160f796da8c01bc4c8d250d7c8ed75a71bb4e9d591907ca66b7fd7f4f68f57898551fab04a7011ba33a11759a531db907b888a11d38fb5d821664f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hardwrap-doc"
RDEPENDS:${PN} += ""

inherit rpm
