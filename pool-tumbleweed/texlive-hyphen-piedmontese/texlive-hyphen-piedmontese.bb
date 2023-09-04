SUMMARY = "Piedmontese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Piedmontese in ASCII encoding. \
Compliant with 'Gramatica dla lengua piemonteisa' by Camillo \
Brero."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-piedmontese-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "fe54580c66dfb161ae66ed4fe1dfcce168298129eaafd77037c7f65a93ea6f4d105d5c394f93b55d4a4fb0c9cee23792a3b50bbd8b0badd7e7f406403919ae8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pms.tex \
tex-hyph-quote-pms.tex \
tex-loadhyph-pms.tex \
texlive-hyphen-piedmontese"

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
