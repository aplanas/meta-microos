SUMMARY = "Some enhancements to the gmdoc package"
DESCRIPTION = "This package provides some enhancements for the gmdoc package: \
nicer formatting for multiple line inline comments, an ability \
to 'comment out' some code, and a macro to input other files in \
'normal' LaTeX mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-2023.201.0.0.2svn15878-53.2.noarch.rpm"
RPM_HASH = "5114fdfcfb3bc8626b973001df7c570a83ba63186aaa59a932ae1b8737cdc76f937eeaf5b52ef0583069d0926c86fa280ca75561fb195986e1932bb7dcab492c"
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
