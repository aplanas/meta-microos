SUMMARY = "Documentation for texlive-eledform"
DESCRIPTION = "This package includes the documentation for texlive-eledform"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38114"

RPM_NAME = "texlive-eledform-doc-2023.209.1.1asvn38114-54.1.noarch.rpm"
RPM_HASH = "fd2015172cce82650eaf75ec9f653b5294f959c0c201f3f3057f7be78e616decda436d0b42e534c18df69ad870f99500569c77d4f17e2976f7e527096aae6084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledform-doc"

RDEPENDS:${PN} += ""

inherit rpm
