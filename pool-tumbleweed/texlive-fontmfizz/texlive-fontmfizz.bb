SUMMARY = "Font Mfizz icons for use in LaTeX"
DESCRIPTION = "The MFizz font provides scalable vector icons representing \
programming languages, operating systems, software engineering, \
and technology. It can be seen as an extension to FontAwesome. \
This package requires the fontspec package and either the \
Xe(La)TeX or Lua(La)TeX engine to load the included ttf font."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43546"

RPM_NAME = "texlive-fontmfizz-2023.201.svn43546-52.1.noarch.rpm"
RPM_HASH = "208c5409bf9aa2445171a40b5615cfc22731b58d323ae9851a66a8cb17eccd7eadc19e59558cbb521663ed807df9e984f8b315dbf39b799f35cd858b466cff40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fontmfizz.sty) \
texlive-fontmfizz"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
texlive \
texlive-filesystem \
texlive-fontmfizz-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
