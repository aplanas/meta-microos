SUMMARY = "Display the allocation status of the TeX registers"
DESCRIPTION = "Adds a macro \\rgcounts which displays the allocation status of \
the TeX registers. The display is written into the .log file as \
it is a bit verbose. An automatic call to \\rgcounts is done at \
\\begin{document} and \\end{document}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19979"

RPM_NAME = "texlive-regcount-2023.209.1.0svn19979-54.1.noarch.rpm"
RPM_HASH = "a30a48ab60cbbb06fd7a53e4e2b89c6ddce442d33849602417205812c2ffee46462d020b7b0b783a81544158352721e590621f456e4183f4f07a267c3f7a9ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regcount.sty \
texlive-regcount"

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
