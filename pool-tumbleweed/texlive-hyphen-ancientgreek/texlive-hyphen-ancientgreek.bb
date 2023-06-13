SUMMARY = "Ancient Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Ancient Greek in LGR and UTF-8 \
encodings, including support for (obsolete) Ibycus font \
encoding. Patterns in UTF-8 use two code positions for each of \
the vowels with acute accent (a.k.a tonos, oxia), e.g., U+03AE, \
U+1F75 for eta."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-ancientgreek-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "87e544aa22dfdac7cb2551109514e22eb2bfecc6179bc0ef974640b3703316b24ef97e2f234f2a48ab16995d93fc8d1fec6e053c8d7a1e52f7df651d15d13663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grahyph5.tex) \
tex(hyph-grc.tex) \
tex(ibyhyph.tex) \
tex(loadhyph-grc.tex) \
texlive-hyphen-ancientgreek"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
