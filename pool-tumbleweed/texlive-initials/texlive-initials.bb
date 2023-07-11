SUMMARY = "Adobe Type 1 decorative initial fonts"
DESCRIPTION = "For each font, at least a .pfb and a .tfm file is provided, \
with an .fd file for use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54080"

RPM_NAME = "texlive-initials-2023.208.svn54080-53.1.noarch.rpm"
RPM_HASH = "e16123d6e6d172bf30f1ce7e2f8fb3216a9a0db600013a5cfd8ba0cfca0722b2db9f383d5d1b4a040626e48cf66c44098f9fb7ae340b5bd7637be8f3f329e9b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Acorn.fd \
tex-Acorn.map \
tex-Acorn.tfm \
tex-AnnSton.fd \
tex-AnnSton.map \
tex-AnnSton.tfm \
tex-ArtNouv.fd \
tex-ArtNouv.map \
tex-ArtNouv.tfm \
tex-ArtNouvc.fd \
tex-ArtNouvc.map \
tex-ArtNouvc.tfm \
tex-Carrickc.fd \
tex-Carrickc.map \
tex-Carrickc.tfm \
tex-Eichenla.fd \
tex-Eichenla.map \
tex-Eichenla.tfm \
tex-Eileen.fd \
tex-Eileen.map \
tex-Eileen.tfm \
tex-EileenBl.fd \
tex-EileenBl.map \
tex-EileenBl.tfm \
tex-Elzevier.fd \
tex-Elzevier.map \
tex-Elzevier.tfm \
tex-GotIn.fd \
tex-GotIn.map \
tex-GotIn.tfm \
tex-GoudyIn.fd \
tex-GoudyIn.map \
tex-GoudyIn.tfm \
tex-Kinigcap.fd \
tex-Kinigcap.map \
tex-Kinigcap.tfm \
tex-Konanur.fd \
tex-Konanur.map \
tex-Konanur.tfm \
tex-Kramer.fd \
tex-Kramer.map \
tex-Kramer.tfm \
tex-MorrisIn.fd \
tex-MorrisIn.map \
tex-MorrisIn.tfm \
tex-Nouveaud.fd \
tex-Nouveaud.map \
tex-Nouveaud.tfm \
tex-Romantik.fd \
tex-Romantik.map \
tex-Romantik.tfm \
tex-Rothdn.fd \
tex-Rothdn.map \
tex-Rothdn.tfm \
tex-RoyalIn.fd \
tex-RoyalIn.map \
tex-RoyalIn.tfm \
tex-Sanremo.fd \
tex-Sanremo.map \
tex-Sanremo.tfm \
tex-Starburst.fd \
tex-Starburst.map \
tex-Starburst.tfm \
tex-Typocaps.fd \
tex-Typocaps.map \
tex-Typocaps.tfm \
tex-Zallman.fd \
tex-Zallman.map \
tex-Zallman.tfm \
texlive-initials"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-initials-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
