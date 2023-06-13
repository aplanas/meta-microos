SUMMARY = "Hungarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Hungarian in T1/EC and UTF-8 \
encodings."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-hungarian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "96b3d640dde36540a23aaafc7d2f75ec5dcdbf127c9b0868777d68895b2a0273263894fd82c79e67f7d7a6b379038effa128d42f12c20c824a8c68eab899ef38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-hu.ec.tex) \
tex(hyph-hu.tex) \
tex(loadhyph-hu.tex) \
texlive-hyphen-hungarian"

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
