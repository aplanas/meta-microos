SUMMARY = "Typeset metric marks for Latin text"
DESCRIPTION = "The package may be used to type the prosodics/metrics of \
(latin) verse; it provides macros to typeset the symbols \
standing alone, and in combination with symbols, giving \
automatic alignment. The package requires TikZ (including the \
calc library), xpatch, and xparse (thus also requiring the \
experimental LaTeX3 environment)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn52323"

RPM_NAME = "texlive-metrix-2023.209.1.5svn52323-55.1.noarch.rpm"
RPM_HASH = "86ac93392f188e8145815510d2304d6a7eacf3d44f5ae7e40b15902553cba44aec346d8ffc8f17eaab265089b4d7caffa20e7dc71cdc820327049f476a60640d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metrix.sty \
texlive-metrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
