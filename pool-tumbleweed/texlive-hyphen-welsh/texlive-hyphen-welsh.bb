SUMMARY = "Welsh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Welsh in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-welsh-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "49416cf20c1f91c608ae25aef7abd4849d4778a4fbb5a96e4ff87098ba01aff828fc8da167dc588e69fc54b6f14825c5ee1e19d909d6fb30ed9f34916fdcc976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-cy.ec.tex \
tex-hyph-cy.tex \
tex-loadhyph-cy.tex \
texlive-hyphen-welsh"

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
