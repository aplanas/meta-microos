SUMMARY = "Epigraphs using key values"
DESCRIPTION = "This package lays out epigraphs: quotations across a page, \
usually to open or close a chapter. It is intended as a simple \
replacement for the more sophisticated epigraph package. The \
package depends on pgfkeys, conditionals (which is distributed \
as part of the songbook package), enumitem, and microtype."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-2023.209.1.0svn61719-54.2.noarch.rpm"
RPM_HASH = "ff188bae000cf03496901224d778c3e21e8b4624c021110fd2eb445fe3e1e1b5ce32aabbc7f1fe6eb44fe40a3cb87e15a141b9743293ceeb827ada8e7045a379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epigraph-keys.sty \
texlive-epigraph-keys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-conditionals.sty \
tex-enumitem.sty \
tex-microtype.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
