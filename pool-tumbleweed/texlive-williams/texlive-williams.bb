SUMMARY = "Miscellaneous macros by Peter Williams"
DESCRIPTION = "The bundle provides two packages: antree, which provides macros \
for annotated node trees, and toklist, which is an \
implementation of Knuth's token list macros, to be found on \
pp.378-379 of the TeXbook."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-williams-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "895f80bbb7549d7e3defeaa068024cb40751ce9ad2dfa3235f592512346249a9772f456b8e61ac71f5b738408f1d18e324277abbdfdedc195bdc8e4c5343d4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-antree.sty \
tex-toklist.sty \
texlive-williams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eepic.sty \
tex-epic.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
