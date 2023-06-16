SUMMARY = "The skak chess fonts redone in Adobe Type 1"
DESCRIPTION = "This package offers Adobe Type 1 versions of the fonts provided \
as Metafont source by the skak bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20031"

RPM_NAME = "texlive-skaknew-2023.201.svn20031-57.1.noarch.rpm"
RPM_HASH = "7b5a72f2f9a7fae452440136ed36eaf0d6823373289c0f041bb8926c9e4ba5c5402d7c629776a760bfb32441cd470cd4f9cfb67e78ecb503936c541ec4a89b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlphaDia.tfm \
tex-SkakNew-Diagram.tfm \
tex-SkakNew-DiagramT.tfm \
tex-SkakNew-Figurine.tfm \
tex-SkakNew-FigurineBold.tfm \
tex-SkakNew.map \
texlive-skaknew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-skaknew-fonts"

inherit rpm
