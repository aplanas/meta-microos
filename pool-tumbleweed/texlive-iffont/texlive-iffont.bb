SUMMARY = "Conditionally load fonts with fontspec"
DESCRIPTION = "This package provides a macro to select the first font XeLaTeX \
or LuaTeX can find in a comma separated list and, additionally, \
a number of macro tests."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn38823"

RPM_NAME = "texlive-iffont-2023.209.1.0.0svn38823-54.1.noarch.rpm"
RPM_HASH = "0e69fa93658f929e0479281f6ec8db01381665094952723305c9b812026d6515c14a078fed473f8ce620e55480a7ab3ea5b74575d2151c4392e2e7e6018c8b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iffont.sty \
texlive-iffont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
