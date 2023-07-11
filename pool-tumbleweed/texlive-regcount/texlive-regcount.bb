SUMMARY = "Display the allocation status of the TeX registers"
DESCRIPTION = "Adds a macro \\rgcounts which displays the allocation status of \
the TeX registers. The display is written into the .log file as \
it is a bit verbose. An automatic call to \\rgcounts is done at \
\\begin{document} and \\end{document}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19979"

RPM_NAME = "texlive-regcount-2023.201.1.0svn19979-53.2.noarch.rpm"
RPM_HASH = "91450d6d25cca502279cb16a5080154e7598b8f56788b2b203dbfa0cb5d4125a7f8c160f9ee1de1a7f45ea51a24ecdeaae708a9e91796e1e20cd8882a4f2f73f"
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
