SUMMARY = "Documentation for texlive-ntheorem"
DESCRIPTION = "This package includes the documentation for texlive-ntheorem"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.33svn27609"

RPM_NAME = "texlive-ntheorem-doc-2023.209.1.33svn27609-55.1.noarch.rpm"
RPM_HASH = "e7def4fa2e03a13dc73b341a6bdd0aa40af86ec5cd8130762b141fba4e5ac2c9de0b5bdb670eb4a4d07457a84a4a3913c5a9ab86c993ec169ccb1bab16c57af3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ntheorem-doc-en \
texlive-ntheorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
