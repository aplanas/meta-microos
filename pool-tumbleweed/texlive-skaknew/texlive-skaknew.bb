SUMMARY = "The skak chess fonts redone in Adobe Type 1"
DESCRIPTION = "This package offers Adobe Type 1 versions of the fonts provided \
as Metafont source by the skak bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20031"

RPM_NAME = "texlive-skaknew-2023.209.svn20031-58.1.noarch.rpm"
RPM_HASH = "dae3ede200e0580c04ad00c0df0a1b0c4f67147d194999cc30cc599b7cffa561a47297c99e2d5edb1d1784b7b458b9cd251b3a4f5513b0453a9f36c1d74170a5"
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
