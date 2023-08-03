SUMMARY = "Show 'realistic' quotes in verbatim"
DESCRIPTION = "Typewriter-style fonts are best for program listings, but \
Computer Modern Typewriter prints ` and ' as bent opening and \
closing single quotes. Other fonts, and most programming \
languages, print ` as a grave accent and ' upright; ' is used \
both to open and to close quoted strings. The package switches \
the typewriter font to Computer Modern Typewriter in OT1 \
encoding, and modifies the behaviour of verbatim, verbatim*, \
\\verb, and \\verb* to print in the '` and ' way'. It does \
thisregardless of other fonts or encodings in use, so long as \
the package is loaded after the other fonts were. The package \
does not affect \\tt, \\texttt, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn26059"

RPM_NAME = "texlive-upquote-2023.209.1.3svn26059-54.1.noarch.rpm"
RPM_HASH = "bfa198cca98cac14021c167bf87e9dbd287573b853e3e2e1ed06499ac9b038688f97620d68e5c584b796603c6ddc8419f309418f71a191029bb93ab95c1ab53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upquote.sty \
texlive-upquote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
