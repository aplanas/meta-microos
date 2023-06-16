SUMMARY = "Tangram puzzles, with TikZ"
DESCRIPTION = "This package provides some commands (with English and French \
keys) to work with tangram puzzles: \\begin{EnvTangramTikz} and \
\\PieceTangram to position a piece, \\TangramTikz to display a \
predefined Tangram."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.5svn66183"

RPM_NAME = "texlive-tangramtikz-2023.201.0.0.1.5svn66183-54.1.noarch.rpm"
RPM_HASH = "abe45eed514ecb89b97d1c4257874125a489236239a94006f6c3104ea23fa51a66424c8347356189500c4649458ffe79dc4cb0a1596e119a889d59092604414b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TangramTikz.sty \
texlive-tangramtikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listofitems.sty \
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
