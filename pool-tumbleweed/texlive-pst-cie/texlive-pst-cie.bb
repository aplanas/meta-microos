SUMMARY = "CIE color space"
DESCRIPTION = "pst-cie is a PSTricks related package to show the different CIE \
color spaces: Adobe, CIE, ColorMatch, NTSC, Pal-Secam, \
ProPhoto, SMPTE, and sRGB."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06bsvn60959"

RPM_NAME = "texlive-pst-cie-2023.209.1.06bsvn60959-53.1.noarch.rpm"
RPM_HASH = "27ed008d22ffe725aed21c0a9dd823775819c27c527698404a6034d5fb2968ff616d767537fd313ff29e8cf6aac3767e0a2713e9be44317d4df1c83540d6af2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-cie.sty \
tex-pst-cie.tex \
texlive-pst-cie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
