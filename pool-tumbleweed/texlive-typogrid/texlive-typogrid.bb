SUMMARY = "Print a typographic grid"
DESCRIPTION = "Draws a grid on every page of the document; the grid divides \
the page into columns, and may be used for fixing measurements \
of layout."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn24994"

RPM_NAME = "texlive-typogrid-2023.209.0.0.21svn24994-53.1.noarch.rpm"
RPM_HASH = "f379df591199781dfdedbda7aca4f57bcf361e8abf89b1f18ed7efba3d048e28685dc86b264e35ce3d101f3369fd889bda28a9e9e04e4385abbd1f363f4e230f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typogrid.sty \
texlive-typogrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
