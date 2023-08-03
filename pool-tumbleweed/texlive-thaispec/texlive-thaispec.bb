SUMMARY = "Thai Language Typesetting in XeLaTeX"
DESCRIPTION = "This package allows you to input Thai characters directly to \
LaTeX documents and choose any (system wide) Thai fonts for \
typesetting in XeLaTeX. It also tries to appropriately justify \
paragraphs with no more external tools. Required packages are \
fontspec, ucharclasses, polyglossia, setspace, kvoptions, \
xstring, and xpatch."
LICENSE = "LPPL-1.0"

PV = "2023.209.2021.03.01svn58019"

RPM_NAME = "texlive-thaispec-2023.209.2021.03.01svn58019-55.1.noarch.rpm"
RPM_HASH = "4361f40018e31401ca2236da139cd677696b6d16388e714ebc78f0fd5ace41966962fb569b338dc32a2bffa3771d5561fcc6a824a4a8482dbdeabd8f03340d5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thaispec.sty \
texlive-thaispec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-amsthm.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-mathspec.sty \
tex-mathtools.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-ucharclasses.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
