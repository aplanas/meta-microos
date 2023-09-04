SUMMARY = "Ancient Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Ancient Greek in LGR and UTF-8 \
encodings, including support for (obsolete) Ibycus font \
encoding. Patterns in UTF-8 use two code positions for each of \
the vowels with acute accent (a.k.a tonos, oxia), e.g., U+03AE, \
U+1F75 for eta."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-ancientgreek-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "6b31681172e07a47dfe467ba2ec33e9a7aa6d4bc260eaf07c061763fb9113e63cdcd3542f369a9c09ac69a2432a4d8938ed76f0caca809ca3bcf1f991b5bcb1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grahyph5.tex \
tex-hyph-grc.tex \
tex-ibyhyph.tex \
tex-loadhyph-grc.tex \
texlive-hyphen-ancientgreek"

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
