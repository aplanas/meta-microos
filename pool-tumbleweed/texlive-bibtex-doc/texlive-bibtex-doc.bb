SUMMARY = "Documentation for texlive-bibtex"
DESCRIPTION = "This package includes the documentation for texlive-bibtex"
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.99dsvn66186"

RPM_NAME = "texlive-bibtex-doc-2023.209.0.0.99dsvn66186-54.1.noarch.rpm"
RPM_HASH = "8015fb73aa5a06805a3b35b58e3f8e06b5a88b329d550536ab012f007738e446ad582495ddb8db45a871308ed2b50de6092c18f157c8fe1acb340e3a7c6e5eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtex.1 \
texlive-bibtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
