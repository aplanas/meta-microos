SUMMARY = "Documentation for texlive-pst-solides3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-solides3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.34asvn61719"

RPM_NAME = "texlive-pst-solides3d-doc-2023.209.4.34asvn61719-54.1.noarch.rpm"
RPM_HASH = "2189fe165e68830d01382332d78b98fefd3b7a14ace5a7018591d7b6e3607bd26b96648a4caf14ab5d2c5035dbef6669bc346b4228887c18ae23e95efc72b8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-solides3d-doc-en \
texlive-pst-solides3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
