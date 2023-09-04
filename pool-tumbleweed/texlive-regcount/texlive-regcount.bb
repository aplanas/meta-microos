SUMMARY = "Display the allocation status of the TeX registers"
DESCRIPTION = "Adds a macro \\rgcounts which displays the allocation status of \
the TeX registers. The display is written into the .log file as \
it is a bit verbose. An automatic call to \\rgcounts is done at \
\\begin{document} and \\end{document}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19979"

RPM_NAME = "texlive-regcount-2023.209.1.0svn19979-54.2.noarch.rpm"
RPM_HASH = "eef5f669f2582036777df4f939864d9fb413be84b00b1ae896d123419662fdedc65c222d21120ea90498fb18b5a4f9221878f5e32c6b0300cbe19674e11fe94d"
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
