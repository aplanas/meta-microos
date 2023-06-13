SUMMARY = "Build a format based on the preamble of a LaTeX file"
DESCRIPTION = "The use of formats helps to speed up compilations: packages \
which have been dumped in the format are loaded at very high \
speed. This is useful when a document loads many packages \
(including large packages such as pgf-TikZ). The package was \
developed from the work in mylatex, and eliminates many of the \
limitations and problems of that package."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn21392"

RPM_NAME = "texlive-mylatexformat-2023.201.3.4svn21392-54.1.noarch.rpm"
RPM_HASH = "4094b019f856f145034a7be05f2f631ef64b3a1dee86fff95010d5e525cc2647cb89637ec248e92e6e17583111523ba529544f244578b9a62089aae1ba2b97c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatexformat"

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
