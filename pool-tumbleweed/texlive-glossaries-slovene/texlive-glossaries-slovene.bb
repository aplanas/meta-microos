SUMMARY = "Slovene language module for glossaries package"
DESCRIPTION = "Slovene language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-2023.201.1.0svn51211-53.2.noarch.rpm"
RPM_HASH = "0131ab163afca220642ecee0c5457a9e914d1712bdf4c94fbff51e126906d28ea775145856d860b97eb695730c7464831cb2862a7c493cbaea2dfd6a6ff6a0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-slovene.ldf \
texlive-glossaries-slovene"

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
