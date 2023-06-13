SUMMARY = "Documentation for texlive-tex-gyre"
DESCRIPTION = "This package includes the documentation for texlive-tex-gyre"
LICENSE = "LPPL-1.3c"

PV = "2023.201.2.501svn65956"

RPM_NAME = "texlive-tex-gyre-doc-2023.201.2.501svn65956-54.1.noarch.rpm"
RPM_HASH = "48ee58768efaede445713aa3175819842b6bf07f9f406b1a6e90a237123ee156e606706cfd4d7f7fe96922e2088d631ee412a184486ae0bcc0e3e54ecc0b2b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-doc"

RDEPENDS:${PN} += ""

inherit rpm
