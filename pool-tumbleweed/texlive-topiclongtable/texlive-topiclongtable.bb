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

PV = "2023.201.1.3.2svn54758"

RPM_NAME = "texlive-topiclongtable-2023.201.1.3.2svn54758-52.1.noarch.rpm"
RPM_HASH = "3dd9808f413aadf281085fe21fe80e595d7dc6aaf607e522c1a9ffd168871e6af2ce09db02cf1e9441caddc56187d5fc9531f226508dedfaef59b47cd8bf9898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(topiclongtable.sty) \
texlive-topiclongtable"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(expl3.sty) \
tex(longtable.sty) \
tex(multirow.sty) \
tex(xparse.sty) \
tex(zref-abspage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
