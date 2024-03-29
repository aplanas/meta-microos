SUMMARY = "Tangram puzzles, with TikZ"
DESCRIPTION = "This package provides some commands (with English and French \
keys) to work with tangram puzzles: \\begin{EnvTangramTikz} and \
\\PieceTangram to position a piece, \\TangramTikz to display a \
predefined Tangram."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.5svn66183"

RPM_NAME = "texlive-tangramtikz-2023.209.0.0.1.5svn66183-55.1.noarch.rpm"
RPM_HASH = "889a29da4d4b2f88c41ad76835abc6a84add4d1f8876b519d5ebd510471b493459bae3fb2f54e6f6f0e520ab4459ff7c5ceb481020a804b8ea1a076c5dd9d560"
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
