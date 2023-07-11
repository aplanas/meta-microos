SUMMARY = "Text symbols in maths mode"
DESCRIPTION = "A package which provides access to some interesting characters \
of the Text Companion fonts (TS1 encoding) in maths mode."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1fsvn15878"

RPM_NAME = "texlive-mathcomp-2023.208.0.0.1fsvn15878-53.1.noarch.rpm"
RPM_HASH = "61470a943a6e44d2317bf455b46ad697129b8fb81257e68f4d26b585d871c66084e1bb1a049c0373fe78ad1ca50322b3f8ee424dff4ff98369ead6c164b8f8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathcomp.sty \
texlive-mathcomp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
