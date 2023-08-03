SUMMARY = "Epigraphs using key values"
DESCRIPTION = "This package lays out epigraphs: quotations across a page, \
usually to open or close a chapter. It is intended as a simple \
replacement for the more sophisticated epigraph package. The \
package depends on pgfkeys, conditionals (which is distributed \
as part of the songbook package), enumitem, and microtype."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "a49cdab38721b64c6a267e24cee0cf66506daad5ac0bb513c1f9b830fc0862abed629d06c2b18509550d86fd140b9bdcc76983f2a19c5606a827f23cfbcc00fd"
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
