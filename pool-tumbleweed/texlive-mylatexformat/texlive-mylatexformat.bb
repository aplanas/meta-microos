SUMMARY = "Build a format based on the preamble of a LaTeX file"
DESCRIPTION = "The use of formats helps to speed up compilations: packages \
which have been dumped in the format are loaded at very high \
speed. This is useful when a document loads many packages \
(including large packages such as pgf-TikZ). The package was \
developed from the work in mylatex, and eliminates many of the \
limitations and problems of that package."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn21392"

RPM_NAME = "texlive-mylatexformat-2023.209.3.4svn21392-55.1.noarch.rpm"
RPM_HASH = "6189b92e17afc9480b5c17da55691a47cb2275864482f61a1c4218f57269515ca38202d2f84bf76d79d187b1cb8c503d6018c79a36d33d2b77633cdc4d76f67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatexformat"

RDEPENDS:${PN} += "/usr/bin/sh \
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
