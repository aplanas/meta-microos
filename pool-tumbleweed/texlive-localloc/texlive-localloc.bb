SUMMARY = "Macros for localizing TeX register allocations"
DESCRIPTION = "This package approaches the problem of the shortage of \
registers, by providing a mechanism for local allocation. The \
package works with Plain TeX, LaTeX, and LaTeX 2.09."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn56496"

RPM_NAME = "texlive-localloc-2023.201.svn56496-54.1.noarch.rpm"
RPM_HASH = "8388f3d4eb33d78be820a4a98b4a5852d60d411536390f0d3dde6f1b295d429564a098662c3f542304d660c9d0c865a7a6eb41a34165057717726b4167d6c491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(localloc.sty) \
texlive-localloc"

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
