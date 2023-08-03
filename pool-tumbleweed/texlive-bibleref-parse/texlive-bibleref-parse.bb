SUMMARY = "Specify Bible passages in human-readable format"
DESCRIPTION = "The package parses Bible passages that are given in human \
readable format. It accepts a wide variety of formats. This \
allows for a simpler and more convenient interface to the \
functionality of the bibleref package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn22054"

RPM_NAME = "texlive-bibleref-parse-2023.209.1.1svn22054-54.1.noarch.rpm"
RPM_HASH = "3b470f4f9651b5c7390aabc07d3346339cfae432b0ed2e5b1297efa3f774f9e1e3c4502cd31989aa6f6df81eab003af64801e33d809d9c55833df1327f8e3b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-parse.sty \
texlive-bibleref-parse"

RDEPENDS:${PN} += "/usr/bin/sh \
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
