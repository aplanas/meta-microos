SUMMARY = "Commands for Scrabble boards"
DESCRIPTION = "This package provides some commands (in English and in French) \
to work with a Scrabble Board : \\ScrabbleBoard and \
\\begin{EnvScrabble} and \\ScrabblePutWord for the English \
version, \\PlateauScrabble and \\begin{EnvScrabble} and \
\\ScrabblePlaceMot for the French version."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn65507"

RPM_NAME = "texlive-scrabble-2023.209.0.0.1.3svn65507-54.1.noarch.rpm"
RPM_HASH = "66a88fe1b4d91f9f819f1d871308ce1a0e70f89a92fa9fd2982885e3fd42267e0aa986ddf0032942f7a3aaacc081d6c0fb44c73f2fef96b97f368c850e43e1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Scrabble.sty \
texlive-scrabble"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listofitems.sty \
tex-pgf.sty \
tex-pgffor.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
