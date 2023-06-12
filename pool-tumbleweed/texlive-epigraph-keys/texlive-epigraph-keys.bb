SUMMARY = "Epigraphs using key values"
DESCRIPTION = "This package lays out epigraphs: quotations across a page, \
usually to open or close a chapter. It is intended as a simple \
replacement for the more sophisticated epigraph package. The \
package depends on pgfkeys, conditionals (which is distributed \
as part of the songbook package), enumitem, and microtype."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-2023.201.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "d54d7158de6f06da40827d68ed27e225001b3032acd1b6fbe07ee0bc069e6b80dc8f1ecb6558626a072ae316b777070ebee5b4725acba1271e84fcf962ae7c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epigraph-keys.sty) \
texlive-epigraph-keys"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(conditionals.sty) \
tex(enumitem.sty) \
tex(microtype.sty) \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
