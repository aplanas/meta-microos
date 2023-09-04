SUMMARY = "Welsh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Welsh in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-welsh-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "5dd1e90eea3b8c646e8f9b67e368f1954ca857670fedc5f5c6bd1faabc6703a211fe4897bf0b9dc6c7c775d34ac5931bbc71bea5ea0c7b057e5af138af9dd454"
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
