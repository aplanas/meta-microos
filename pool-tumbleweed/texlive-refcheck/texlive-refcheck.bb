SUMMARY = "Check references (in figures, table, equations, etc)"
DESCRIPTION = "The package checks references in a document, looking for \
numbered but unlabelled equations, for labels which are not \
used in the text, for unused bibliography references. It can \
also display label names in text near corresponding numbers of \
equations and/or bibliography references."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-2023.201.1.9.1svn29128-53.1.noarch.rpm"
RPM_HASH = "9538aefea5758e0830cb44338a4e08d5872e0c73d6a9f7a12e7de7f2665cd35cc712b438e472f665aeda72816f4b84011a5f06f1b840ce22e71b9b8a9459ec87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(refcheck.sty) \
texlive-refcheck"
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
