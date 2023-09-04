SUMMARY = "Croatian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Croatian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-croatian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "fab22af735cd044632c25a89989a1664c48e495f217adcc0627e096c2a9fe722adeb132c44480d1b886a8791b6d1840c627a18b717f2fe987a1a7b2f36f961b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hr.ec.tex \
tex-hyph-hr.tex \
tex-loadhyph-hr.tex \
texlive-hyphen-croatian"

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
