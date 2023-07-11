SUMMARY = "Unicode emoji support for pdfLaTeX with sequences"
DESCRIPTION = "This package provides direct support for Unicode emoji in \
pdfLaTeX, with full access to emoji sequences including but not \
limited to flag sequences, diversity modifier sequences, and \
tag sequences. Emojis are displayed through Twemoji digital \
assets, as licensed under the CC-BY 4.0."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65001"

RPM_NAME = "texlive-hwemoji-2023.208.1.0svn65001-53.1.noarch.rpm"
RPM_HASH = "d34ef03e2deb7063c2487ba7743196e9750166febbbbceb788780a79f71559cec6de9d649b88f90b137605f80bbb3f2b6be50af1db08708ec7a338eea40739b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hwemoji.sty \
texlive-hwemoji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifnextok.sty \
tex-scalerel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
