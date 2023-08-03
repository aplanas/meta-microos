SUMMARY = "Shape selection for TX fonts Greek letters"
DESCRIPTION = "The package allows LaTeX users who use the TX fonts to select \
the shapes (italic or upright) for the Greek lowercase and \
uppercase letters. Once the shapes for lowercase and uppercase \
have been selected via a package option, the \\other prefix \
(e.g., \\otheralpha) allows using the alternate glyph (as in the \
fourier package). The txgreeks package does not constrain the \
text font that may be used in the document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21839"

RPM_NAME = "texlive-txgreeks-2023.209.1.0svn21839-53.1.noarch.rpm"
RPM_HASH = "55caf08c8ee8c0fbf5aa5283621411f885b3281b59e0ee716b433ffc46fa7786e9b4b6613df6805adef79b65e62c4f135017885015439b977e28bbd915a40a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-txgreeks.sty \
texlive-txgreeks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-txfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
