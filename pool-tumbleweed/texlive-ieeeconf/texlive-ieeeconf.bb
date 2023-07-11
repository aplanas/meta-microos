SUMMARY = "Macros for IEEE conference proceedings"
DESCRIPTION = "The IEEEconf class implements the formatting dictated by the \
IEEE Computer Society Press for conference proceedings."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-2023.208.1.4svn59665-53.1.noarch.rpm"
RPM_HASH = "4375ff6237e9b6d862f3070a3776089c725c49211fdf02ce7212d2829ec420ff1b36d3cdbc61b285980904dedca2319d8ec7f0e486abd8baad69fc85b4be53a8"
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
