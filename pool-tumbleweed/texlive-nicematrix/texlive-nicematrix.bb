SUMMARY = "Improve the typesetting of mathematical matrices with PGF"
DESCRIPTION = "This package is based on the package array. It creates PGF/TikZ \
nodes under the cells of the array and uses these nodes to \
provide functionalities to construct tabulars, arrays and \
matrices. Among the features : continuous dotted lines for the \
mathematical matrices; exterior rows and columns (so-called \
border matrices); control of the width of the columns; tools to \
color rows and columns with a good PDF result; blocks of cells; \
etc. The package requires and loads l3keys2e, xparse, array, \
amsmath, pgfcore, and the module shapes of PGF."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.16svn66461"

RPM_NAME = "texlive-nicematrix-2023.209.6.16svn66461-55.1.noarch.rpm"
RPM_HASH = "fab26e9d86bf2ad94a72b56088d810b0932ffa2e62b5a5979ce9fe0638b7290749b973927d02b0f2c2206a523d66d8cd6894e86a5a0fa35f056d38d4dacddcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nicematrix.sty \
texlive-nicematrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-footnote.sty \
tex-footnotehyper.sty \
tex-l3keys2e.sty \
tex-pgfcore.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
