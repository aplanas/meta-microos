SUMMARY = "Shape selection for TX fonts Greek letters"
DESCRIPTION = "The package allows LaTeX users who use the TX fonts to select \
the shapes (italic or upright) for the Greek lowercase and \
uppercase letters. Once the shapes for lowercase and uppercase \
have been selected via a package option, the \\other prefix \
(e.g., \\otheralpha) allows using the alternate glyph (as in the \
fourier package). The txgreeks package does not constrain the \
text font that may be used in the document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21839"

RPM_NAME = "texlive-txgreeks-2023.201.1.0svn21839-52.1.noarch.rpm"
RPM_HASH = "78749d99ba3b0fcf6ace142509c2ee2ca87cb735322bf2c11c500a0b4e7e7556990bd27c764aa275906df4d852c2933449245292075ef90a40ab917d2dd3eeb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-txgreeks.sty \
texlive-txgreeks"

RDEPENDS:${PN} += "/bin/sh \
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
