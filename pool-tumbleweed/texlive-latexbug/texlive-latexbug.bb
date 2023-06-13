SUMMARY = "Bug-classification for LaTeX related bugs"
DESCRIPTION = "The package is written in order to help identifying the \
rightful addressee for a bug report. The LaTeX team asks that \
it will be loaded in any test file that is intended to be sent \
to the LaTeX bug database as part of a bug report."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0nsvn63596"

RPM_NAME = "texlive-latexbug-2023.201.1.0nsvn63596-54.1.noarch.rpm"
RPM_HASH = "3ae1f9f37f2f6341b78bd557d20c9e35353591dead1b501867c376d6d877ff532c416b4ac466e851302c1b8a692b511e9394f9e60fa1a532ba4a33c56f1caa33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latexbug.sty) \
texlive-latexbug"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
