SUMMARY = "Drawing very thick lines and curves"
DESCRIPTION = "The package supports drawing of very thick lines and curves in \
PSTricks, with various fillings for the body of the lines."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16369"

RPM_NAME = "texlive-pst-thick-2023.201.1.0svn16369-53.1.noarch.rpm"
RPM_HASH = "a37efe6be33013b4df854ac71f9b292c0eb9176fa1d9d3e1cf447f194c8828a2052a24083734ff789a51fbd2612742e67c5194ce9cef4eabeb477df3b8ac7a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-thick.sty) \
tex(pst-thick.tex) \
texlive-pst-thick"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
