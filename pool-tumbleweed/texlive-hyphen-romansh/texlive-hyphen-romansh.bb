SUMMARY = "Romansh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Romansh in ASCII encoding. They are \
supposed to comply with the rules indicated by the Lia \
Rumantscha (Romansh language society)."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-romansh-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "cf49b4d654e4de89824a9d6972a4a2dd26a472138b50cec7db5dc01512eadf0611c1e7ce3b117fdd3ba53ca2775f0f890c83b65f5af84d4368fedaa56849111b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-quote-rm.tex \
tex-hyph-rm.tex \
tex-loadhyph-rm.tex \
texlive-hyphen-romansh"

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
