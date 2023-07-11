SUMMARY = "Macros for RTL typesetting"
DESCRIPTION = "This package provides some macros for right-to-left \
typesetting. It uses by default the arabic fonts Scheherazade \
and ALM fixed, the only monospaced arabic font. The package \
works with LuaLaTeX or XeLaTeX, but not with pdfLaTeX or latex."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.02svn59423"

RPM_NAME = "texlive-hvarabic-2023.208.0.0.02svn59423-53.1.noarch.rpm"
RPM_HASH = "66c8d9058d73fd29405571bbdaf8c412ac9e593921f5e5bef9bf81f22f00e42ed0e7b6865f770da6af924409b3fc36337c026bb9843792c30a3dea7e825b3b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvarabic.sty \
texlive-hvarabic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
