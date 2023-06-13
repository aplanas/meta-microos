SUMMARY = "Print a typographic grid"
DESCRIPTION = "Draws a grid on every page of the document; the grid divides \
the page into columns, and may be used for fixing measurements \
of layout."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn24994"

RPM_NAME = "texlive-typogrid-2023.201.0.0.21svn24994-52.1.noarch.rpm"
RPM_HASH = "455d89d964c4bf09a8bfac85c0079c5580fb0da4de31ae2cf2205ad1e2288b9413ea8b112743ec10f836036b2ccbf44c66f279c97ca488e80b868892d2c3077d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(typogrid.sty) \
texlive-typogrid"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(eso-pic.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
