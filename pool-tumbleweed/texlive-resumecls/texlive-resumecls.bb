SUMMARY = "Typeset a resume both in English and Chinese"
DESCRIPTION = "A LaTeX document class to typeset a resume or CV both in \
English and Chinese with more ease and flexibility."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-2023.201.0.0.4.1svn54815-53.1.noarch.rpm"
RPM_HASH = "d2818d4c8447d849f59cc1fbc1c42e701cbcf9f257a44e7cbac4209570561906851954765aeccb2c795f20680f59b833ff0465f32d4220fc1993710ff92cc4fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(resumecls.cls) \
texlive-resumecls"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(ctexart.cls) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(natbib.sty) \
tex(tabularx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
