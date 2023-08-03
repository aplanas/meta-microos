SUMMARY = "Letter document class"
DESCRIPTION = "Designed for formatting formless letters in German; can also be \
used for English (by those who can read the documentation). \
There are LaTeX 2.09 documentstyle and LaTeX 2e class files for \
both an 'old' and a 'new' version of g-brief."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0.3svn50415"

RPM_NAME = "texlive-g-brief-2023.209.4.0.3svn50415-53.1.noarch.rpm"
RPM_HASH = "c2d6952c944334128c61293262df9bab060011a2c924ea644cdd08b140abb69b9d549ef8f0166c7543401125938d8ba6c65a98df663959ae0959c9aeb3b866af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-g-brief.cls \
tex-g-brief.sty \
tex-g-brief2.cls \
tex-g-brief2.sty \
texlive-g-brief"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-eurosym.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-letter.cls \
tex-marvosym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
