SUMMARY = "Czech hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Czech in T1/EC and UTF-8 encodings. \
Original patterns 'czhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-czech-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "edbb6c1efd2212186dde05b638cdfe31c7a8c5a2c468a5171e9ae7738002f7477c642ae1d099ea09b901cdc389cce3785491f18eb7605198352a172c7905ee8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-cs.ec.tex) \
tex(hyph-cs.tex) \
tex(loadhyph-cs.tex) \
texlive-hyphen-czech"
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
