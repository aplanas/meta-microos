SUMMARY = "Alternative versions of 'ragged'-type commands"
DESCRIPTION = "The package defines new commands \\Centering, \\RaggedLeft, and \
\\RaggedRight and new environments Center, FlushLeft, and \
FlushRight, which set ragged text and are easily configurable \
to allow hyphenation (the corresponding commands in LaTeX, all \
of whose names are lower-case, prevent hyphenation altogether)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn66152"

RPM_NAME = "texlive-ragged2e-2023.201.3.4svn66152-53.2.noarch.rpm"
RPM_HASH = "cfe38addbfcd515f2a9c9f84b7f97ccb4c5211391a2b3070b8b8b98e84ffc8732ea4e1473830a4b1aad189c7200e161c6ba0d824845dbb947a95cddc9494cf12"
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
