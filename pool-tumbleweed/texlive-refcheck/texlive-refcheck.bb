SUMMARY = "Check references (in figures, table, equations, etc)"
DESCRIPTION = "The package checks references in a document, looking for \
numbered but unlabelled equations, for labels which are not \
used in the text, for unused bibliography references. It can \
also display label names in text near corresponding numbers of \
equations and/or bibliography references."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-2023.209.1.9.1svn29128-54.1.noarch.rpm"
RPM_HASH = "2fee640071f6a6eb4e3a38d4413faf65d63c23f8def34172df8488ec28022ae7ff8a44c5885b8d356c3cf6e2bac9fff76eef0a2770cac9fe7db59bf10c70a8de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refcheck.sty \
texlive-refcheck"

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
