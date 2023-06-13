SUMMARY = "Typeset critical editions"
DESCRIPTION = "This is the type example package for typesetting scholarly \
critical editions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.17svn61719"

RPM_NAME = "texlive-edmac-2023.201.3.17svn61719-53.1.noarch.rpm"
RPM_HASH = "d4513eebc0272e16a9e94d9eda5329697aa8445bcbb9d51248ca56b2b1160aaaf0f52de8a9c7b77c92f8617e66203778c372cc64f6caa31c975cc9780c3c5792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(edmac.tex) \
tex(edmacfss.sty) \
tex(edstanza.tex) \
tex(tabmac.tex) \
texlive-edmac"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
