SUMMARY = "Macros for localizing TeX register allocations"
DESCRIPTION = "This package approaches the problem of the shortage of \
registers, by providing a mechanism for local allocation. The \
package works with Plain TeX, LaTeX, and LaTeX 2.09."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56496"

RPM_NAME = "texlive-localloc-2023.209.svn56496-55.1.noarch.rpm"
RPM_HASH = "4944cb15acab50b1987305f4eddfd0ca32c3baf9f82754939adadd91e72e063d1c806b301d564f3cb9dcf46787f6ab93b6175db8956d033d0e71ee72c5c704b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-localloc.sty \
texlive-localloc"

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
