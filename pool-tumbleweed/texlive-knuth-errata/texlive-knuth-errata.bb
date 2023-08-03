SUMMARY = "Knuth's published errata"
DESCRIPTION = "These files record details of problems reported in Knuth's \
'Computers and Typesetting' series of books, for the Computer \
Modern fonts, and for TeX, Metafont and related programs."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn58682"

RPM_NAME = "texlive-knuth-errata-2023.209.svn58682-56.1.noarch.rpm"
RPM_HASH = "ced95680e1b5ef290137dae6d077aa1521dfeee92528e2cac488698dcfc63fbaef197adbb18a19085e2c23e7b6a16df42226033e5c9ed562bbf2c4fc771984bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knuth-errata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
