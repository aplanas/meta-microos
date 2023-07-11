SUMMARY = "Ancient Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Ancient Greek in LGR and UTF-8 \
encodings, including support for (obsolete) Ibycus font \
encoding. Patterns in UTF-8 use two code positions for each of \
the vowels with acute accent (a.k.a tonos, oxia), e.g., U+03AE, \
U+1F75 for eta."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-ancientgreek-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "c293242b81bb11d06a7086622e68a637d9a1683b9029017fb3b14c67a6d86df70ca8f3e0b614d6fd024b6bf580103c14c1570f4a7a74749c19ab3b4f7796535e"
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
