SUMMARY = "Macros for IEEE conference proceedings"
DESCRIPTION = "The IEEEconf class implements the formatting dictated by the \
IEEE Computer Society Press for conference proceedings."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-2023.209.1.4svn59665-54.1.noarch.rpm"
RPM_HASH = "8b6f79044d284944e0fbaafc03f52d7b99e870857cfd46d311737f1320a01f09c3fa8cd62a2afdbd016fbdb59154aa23a72f7c153ca3dc4f02fa21cf3f0ad95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IEEEconf.cls \
texlive-ieeeconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-courier.sty \
tex-helvet.sty \
tex-mathptmx.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
