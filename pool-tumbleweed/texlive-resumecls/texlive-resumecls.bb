SUMMARY = "Typeset a resume both in English and Chinese"
DESCRIPTION = "A LaTeX document class to typeset a resume or CV both in \
English and Chinese with more ease and flexibility."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-2023.201.0.0.4.1svn54815-53.2.noarch.rpm"
RPM_HASH = "3dc187121adef5ddb0a83b4a3f970db85ad2fe28c4ec04110673015cf68177da2c90a225958f0559f860f6ba843053eb252fd130f004d743ba787b7da148cc09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumecls.cls \
texlive-resumecls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ctexart.cls \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-natbib.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
