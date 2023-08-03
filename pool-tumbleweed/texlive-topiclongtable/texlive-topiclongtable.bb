SUMMARY = "Extend longtable with cells that merge hierarchically"
DESCRIPTION = "This LaTeX package extends longtable implementing cells that: \
merge with the one above if it has the same content, do not \
merge with the one above unless the ones on the left are \
merged, are well behaved with respect to longtable chunking on \
page breaks, and automatically draw the correct separation \
lines. The typical use case is a table spanning multiple pages \
that contains a list of hierarchically organized topics (hence \
the package name). The package depends on array, expl3, \
longtable, multirow, xparse, and zref-abspage."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.2svn54758"

RPM_NAME = "texlive-topiclongtable-2023.209.1.3.2svn54758-53.1.noarch.rpm"
RPM_HASH = "f5abbadc712a58ca970ef0a7808bee6ac51b123f4628975de81db702792d9c142431fd0fecbe418c1b10689cca0403b82ca66125a141cd2975f181db26e1719b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-topiclongtable.sty \
texlive-topiclongtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-expl3.sty \
tex-longtable.sty \
tex-multirow.sty \
tex-xparse.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
