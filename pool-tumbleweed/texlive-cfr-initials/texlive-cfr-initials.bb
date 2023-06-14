SUMMARY = "LaTeX packages for use of initials"
DESCRIPTION = "This is a set of 23 tiny packages designed to make it easier to \
use fonts from the initials package in LaTeX, e.g. with the \
lettrine package. It is a response to comments on an answer at \
TeX Stack Exchange (https://tex.stackexchange.com/a/236410/) \
requesting sample package files for others to copy. I had \
previously assumed these were too trivial to be of interest, \
but if they would be useful, then I would prefer them to be \
generally available via CTAN."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn61719"

RPM_NAME = "texlive-cfr-initials-2023.201.1.01svn61719-52.1.noarch.rpm"
RPM_HASH = "d5e8c7a442555617866ae97380a5c385ce1ccb8b69444bf0a3151e7bfda18107f68dcaee586ec460c90cd7cdb801320c3d47f3c8509e0d3eee167b3c3927572a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Acorn.sty \
tex-AnnSton.sty \
tex-ArtNouv.sty \
tex-ArtNouvc.sty \
tex-Carrickc.sty \
tex-Eichenla.sty \
tex-Eileen.sty \
tex-EileenBl.sty \
tex-Elzevier.sty \
tex-GotIn.sty \
tex-GoudyIn.sty \
tex-Kinigcap.sty \
tex-Konanur.sty \
tex-Kramer.sty \
tex-MorrisIn.sty \
tex-Nouveaud.sty \
tex-Romantik.sty \
tex-Rothdn.sty \
tex-Royal.sty \
tex-Sanremo.sty \
tex-Starburst.sty \
tex-Typocaps.sty \
tex-Zallman.sty \
texlive-cfr-initials"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-Acorn.fd \
tex-AnnSton.fd \
tex-ArtNouv.fd \
tex-ArtNouvc.fd \
tex-Carrickc.fd \
tex-Eichenla.fd \
tex-Eileen.fd \
tex-EileenBl.fd \
tex-Elzevier.fd \
tex-GotIn.fd \
tex-GoudyIn.fd \
tex-Kinigcap.fd \
tex-Konanur.fd \
tex-Kramer.fd \
tex-MorrisIn.fd \
tex-Nouveaud.fd \
tex-Romantik.fd \
tex-Rothdn.fd \
tex-RoyalIn.fd \
tex-Sanremo.fd \
tex-Starburst.fd \
tex-Typocaps.fd \
tex-Zallman.fd \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
