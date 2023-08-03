SUMMARY = "Some enhancements to the gmdoc package"
DESCRIPTION = "This package provides some enhancements for the gmdoc package: \
nicer formatting for multiple line inline comments, an ability \
to 'comment out' some code, and a macro to input other files in \
'normal' LaTeX mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "de48e0e9892830bea586e6b5ae54360bff56bfdcccce0bdfc5b9dfb574502825be54e69aec5cff61f6c6af9da05f6d62542ce53af4dff8305284a95beed5c62d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmdoc-enhance.sty \
texlive-gmdoc-enhance"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-gmdoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
