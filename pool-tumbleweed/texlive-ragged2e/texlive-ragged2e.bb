SUMMARY = "Alternative versions of 'ragged'-type commands"
DESCRIPTION = "The package defines new commands \\Centering, \\RaggedLeft, and \
\\RaggedRight and new environments Center, FlushLeft, and \
FlushRight, which set ragged text and are easily configurable \
to allow hyphenation (the corresponding commands in LaTeX, all \
of whose names are lower-case, prevent hyphenation altogether)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn66152"

RPM_NAME = "texlive-ragged2e-2023.209.3.4svn66152-54.2.noarch.rpm"
RPM_HASH = "bb2cdde456c17fbc98a33668e493779dd366ab1d6f3dc2857dc84deb82d8515ad1f7ab7ec6e9a68369d493698c0631c37b4470c60991c42bf66b9fa14caa8bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ragged2e.sty \
texlive-ragged2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everysel.sty \
tex-footmisc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
