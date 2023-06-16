SUMMARY = "Create tables of signs and of variations"
DESCRIPTION = "The package allows the user to use the computer algebra system \
XCAS to generate tables of signs and of variations (the actual \
plotting of the tables uses the MetaPost macro package \
tableauVariations). Tables with forbidden regions may be \
developed using the package. A configuration file permits some \
configuration of the language to be used in the diagrams. The \
tablor package requires that shell escape be enabled."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.07_gsvn31855"

RPM_NAME = "texlive-tablor-2023.201.4.07_gsvn31855-54.1.noarch.rpm"
RPM_HASH = "8c96f82d6324cc7513f0fe10f555339792a1425d92c3afa50e4b779a5b8da6e9d1a072fdc71f92c158fd731c0bd65b1fc805b16416bfe9ecf79f993b08837d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablor-xetex.sty \
tex-tablor.cfg \
tex-tablor.sty \
texlive-tablor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fancyvrb.sty \
tex-filecontents.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-pst-eps.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
