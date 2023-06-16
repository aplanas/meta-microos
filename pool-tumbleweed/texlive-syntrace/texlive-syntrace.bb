SUMMARY = "Labels for tracing in a syntax tree"
DESCRIPTION = "This package adds support for traces in trees created using \
either the synttree or the qtree package. The package provides \
two commands (\\traceLabel and \\traceReference) to set and use a \
trace."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-syntrace-2023.201.1.1svn15878-57.1.noarch.rpm"
RPM_HASH = "046773290dfc5460bc1b6a2f0ffc72309e24e5230dcdd7d55e968460d6d82666af901425f91bb3523b0841208f67b7edb6d8d88f4c269e580197d54428611106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syntrace.sty \
texlive-syntrace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-qtree.sty \
tex-synttree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
