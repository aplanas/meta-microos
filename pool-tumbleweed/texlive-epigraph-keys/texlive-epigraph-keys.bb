SUMMARY = "Epigraphs using key values"
DESCRIPTION = "This package lays out epigraphs: quotations across a page, \
usually to open or close a chapter. It is intended as a simple \
replacement for the more sophisticated epigraph package. The \
package depends on pgfkeys, conditionals (which is distributed \
as part of the songbook package), enumitem, and microtype."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-2023.201.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "46d3fedd45c9edc6d6fcc110627196bf08701b1520aeace27d895561dd12c8883747f77b22772f70552612cb052b91a23469d0322c6ae34acd3001b5573a59fd"
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
