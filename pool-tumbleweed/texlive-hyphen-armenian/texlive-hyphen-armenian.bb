SUMMARY = "Armenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Armenian for Unicode engines. \
Auto-generated from a script included in hyph-utf8."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-armenian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "ce1ab47c4bc3dca1a2fe6677bb742d775d3034c8c9466bbaa8b3ca989b57f4b868bf5b3d4f7bc244912b5ffc008082da8c59e26570147eb6066721eab635df60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hy.tex \
tex-loadhyph-hy.tex \
texlive-hyphen-armenian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
