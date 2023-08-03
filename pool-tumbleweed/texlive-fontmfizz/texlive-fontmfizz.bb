SUMMARY = "Font Mfizz icons for use in LaTeX"
DESCRIPTION = "The MFizz font provides scalable vector icons representing \
programming languages, operating systems, software engineering, \
and technology. It can be seen as an extension to FontAwesome. \
This package requires the fontspec package and either the \
Xe(La)TeX or Lua(La)TeX engine to load the included ttf font."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43546"

RPM_NAME = "texlive-fontmfizz-2023.209.svn43546-53.1.noarch.rpm"
RPM_HASH = "881a317e8e1809579f2e6378874b34818302a9c9961225db2520dc4cdf55a3f1942e7425d6e6576af54edffa997352324a92da78dddf4121153c63c5fb546e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontmfizz.sty \
texlive-fontmfizz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-fontmfizz-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
