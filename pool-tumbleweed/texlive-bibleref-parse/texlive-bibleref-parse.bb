SUMMARY = "Specify Bible passages in human-readable format"
DESCRIPTION = "The package parses Bible passages that are given in human \
readable format. It accepts a wide variety of formats. This \
allows for a simpler and more convenient interface to the \
functionality of the bibleref package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn22054"

RPM_NAME = "texlive-bibleref-parse-2023.201.1.1svn22054-53.1.noarch.rpm"
RPM_HASH = "f90f90fa8c7612a895d0c8370d638abc8f932249a34f28ca2abaa71993d559f894c131ad34fe8b72bc8d62b3c02056be76b1be03494e94fc0979d7d4b551627f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-parse.sty \
texlive-bibleref-parse"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref.sty \
tex-etoolbox.sty \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
