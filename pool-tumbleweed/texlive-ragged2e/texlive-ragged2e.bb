SUMMARY = "Alternative versions of 'ragged'-type commands"
DESCRIPTION = "The package defines new commands \\Centering, \\RaggedLeft, and \
\\RaggedRight and new environments Center, FlushLeft, and \
FlushRight, which set ragged text and are easily configurable \
to allow hyphenation (the corresponding commands in LaTeX, all \
of whose names are lower-case, prevent hyphenation altogether)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn66152"

RPM_NAME = "texlive-ragged2e-2023.201.3.4svn66152-53.1.noarch.rpm"
RPM_HASH = "359ce1db21068e42a899addee739f22026410ea3a43fa42e4b18a4ad8efd127e7cac3bf45f76e8c983e69a27e7c585c7062b9a0cc343a3affc70f0c56665fb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ragged2e.sty) \
texlive-ragged2e"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everysel.sty) \
tex(footmisc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
