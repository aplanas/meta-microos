SUMMARY = "Key value parser with default handler support"
DESCRIPTION = "This package provides \\kvsetkeys, a variant of package keyval's \
\\setkeys. It allows the user to specify a handler that deals \
with unknown options. Active commas and equal signs may be used \
(e.g. see babel's shorthands) and only one level of curly \
braces are removed from the values."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.19svn64632"

RPM_NAME = "texlive-kvsetkeys-2023.209.1.19svn64632-56.1.noarch.rpm"
RPM_HASH = "889c6c68dbb20db3b38c643cdb0adca77c7cd0af0502bc658aaa57e9f1e267d0a5458ad1cbc15132cb03680103dbc6889c410e70ccfa8703723bb8f24cbc490d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvsetkeys.sty \
texlive-kvsetkeys"

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
