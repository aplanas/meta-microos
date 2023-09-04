SUMMARY = "Estonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Estonian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-estonian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "960458396f092452f894ae5f3f3023633d848078f13bc98897adec3895e52a17750e47f90a3cbff600816bc4f386eb900afb600b6548c344aa5aad7db7c119aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-et.ec.tex \
tex-hyph-et.tex \
tex-loadhyph-et.tex \
texlive-hyphen-estonian"

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
