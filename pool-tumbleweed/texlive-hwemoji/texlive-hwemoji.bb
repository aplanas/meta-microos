SUMMARY = "Unicode emoji support for pdfLaTeX with sequences"
DESCRIPTION = "This package provides direct support for Unicode emoji in \
pdfLaTeX, with full access to emoji sequences including but not \
limited to flag sequences, diversity modifier sequences, and \
tag sequences. Emojis are displayed through Twemoji digital \
assets, as licensed under the CC-BY 4.0."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65001"

RPM_NAME = "texlive-hwemoji-2023.201.1.0svn65001-52.1.noarch.rpm"
RPM_HASH = "16298c4f1a230d92f13c45d9eaed0c79f1d841582c2a07e72c3b0df84c57ef404bab226622504147d721f42e3513b3db776abe3d58f7f539bec004a5a10f52df"
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
