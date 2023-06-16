SUMMARY = "Some enhancements to the gmdoc package"
DESCRIPTION = "This package provides some enhancements for the gmdoc package: \
nicer formatting for multiple line inline comments, an ability \
to 'comment out' some code, and a macro to input other files in \
'normal' LaTeX mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "039aa735d94eda3d864c91170b8339ff0c0dd4b75ae7e93bf4ff28f5517e634b27e17332fcc474374b3b2be877bf64d382c79876a549e228141df113372daaa2"
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
