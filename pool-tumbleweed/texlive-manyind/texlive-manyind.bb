SUMMARY = "Provides support for many indexes"
DESCRIPTION = "This package provides support for many indexes, leaving all the \
bookkeeping to LaTeX and makeindex. No extra programs or files \
are needed. One runs latex and makeindex as if there is just \
one index. In the main file one puts commands like \
\\setindex{main} to steer the flow. Some features of makeindex \
may no longer work."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn49874"

RPM_NAME = "texlive-manyind-2023.208.svn49874-53.1.noarch.rpm"
RPM_HASH = "be9aedc427e07bbfba32cda1d4310a1d1127d97340b40454d2c6d31e6447799fb4b6a8441c9d7cc5261627bd6817cc1e8f9dea0969cdb0186bfa37a7bf27211a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manyind.sty \
texlive-manyind"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
