SUMMARY = "Alternative versions of 'ragged'-type commands"
DESCRIPTION = "The package defines new commands \\Centering, \\RaggedLeft, and \
\\RaggedRight and new environments Center, FlushLeft, and \
FlushRight, which set ragged text and are easily configurable \
to allow hyphenation (the corresponding commands in LaTeX, all \
of whose names are lower-case, prevent hyphenation altogether)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn66152"

RPM_NAME = "texlive-ragged2e-2023.209.3.4svn66152-54.1.noarch.rpm"
RPM_HASH = "61f1645ad5e251e39277fe6d9f0149322b80f4156d024b83278ddb331701ab9c8d9fcaa12b75ebbac0b9347053d342ee291e94dcbac918fb28633f3b5d56e47a"
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
