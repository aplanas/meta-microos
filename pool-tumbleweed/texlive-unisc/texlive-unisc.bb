SUMMARY = "Unicode small caps with Lua/XeLaTeX"
DESCRIPTION = "LaTeX produces small caps with \\textsc{text} or {\\scshape \
text}. Neither of these commands produce small caps in Unicode. \
If the output text is copied and pasted somewhere it shows the \
same characters as used in the input. This package aims to \
internally convert all the characters provided to the commands \
mentioned above. It assumes that the file using this package is \
compiled with Lua/XeLaTeX and a good Unicode font which has the \
small caps characters, e.g., Charis SIL."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn63178"

RPM_NAME = "texlive-unisc-2023.209.0.0.2svn63178-54.1.noarch.rpm"
RPM_HASH = "946775b1ad2f56d34ddd8c437ae9e7113c5a828532c50b2604421427186ee41df309549fb05e3172d004df518320bb81e063f26869d7fb8e0873c488c020c6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unisc.sty \
texlive-unisc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfparser.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
