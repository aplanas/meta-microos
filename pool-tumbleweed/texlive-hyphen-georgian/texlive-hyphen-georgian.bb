SUMMARY = "Georgian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Georgian in T8M, T8K and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-georgian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "580e2d043de562ebea1a54bdfeb3a3a456195a45534ce3fd587e6f4b407e22ab1f8d5dc45756581d970193ee9bf09575fcb24b1ecedfa65ae99e3277f02c90f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ka.t8m.tex \
tex-hyph-ka.tex \
tex-loadhyph-ka.tex \
texlive-hyphen-georgian"

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
