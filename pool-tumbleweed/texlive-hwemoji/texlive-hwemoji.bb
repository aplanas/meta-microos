SUMMARY = "Unicode emoji support for pdfLaTeX with sequences"
DESCRIPTION = "This package provides direct support for Unicode emoji in \
pdfLaTeX, with full access to emoji sequences including but not \
limited to flag sequences, diversity modifier sequences, and \
tag sequences. Emojis are displayed through Twemoji digital \
assets, as licensed under the CC-BY 4.0."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65001"

RPM_NAME = "texlive-hwemoji-2023.209.1.0svn65001-54.1.noarch.rpm"
RPM_HASH = "e693c9a7a7f722efe3798ed6224207665a921f2dbceeeeb84a8eddc38bb17a80c7499e55fe2c6228a0e82a4b5a4a04e64ab2bfb3e1969372a28c71fb12713112"
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
