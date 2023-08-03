SUMMARY = "Documentation for texlive-fixlatvian"
DESCRIPTION = "This package includes the documentation for texlive-fixlatvian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1asvn21631"

RPM_NAME = "texlive-fixlatvian-doc-2023.209.1asvn21631-53.1.noarch.rpm"
RPM_HASH = "3d2597fb1b93d0823e7eb5714272a651bbb7944d0a24fb074e06821915e86663984ef5e0d5b713c08a84fa4dd1d94bd15c7d74a507e094188291c701203533b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fixlatvian-doc-lv \
texlive-fixlatvian-doc"

RDEPENDS:${PN} += ""

inherit rpm
