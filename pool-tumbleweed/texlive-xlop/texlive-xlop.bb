SUMMARY = "Calculates and displays arithmetic operations"
DESCRIPTION = "Xlop (eXtra Large OPeration) will typeset arithmetic problems \
either in-line or 'as in school' (using French school \
conventions). So for example, \\opadd{2}{3} can give either \
$2+3=5$ or something similar to: \\begin{tabular}{r} 2\\\\ +3\\\\ \
\\hline 5\\end{tabular}. Furthermore, numbers may be very large, \
e.g 200 figures (with a very long compilation time). Many other \
features allow to deal with numbers (tests, display, some high \
level operations, etc.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.28svn56910"

RPM_NAME = "texlive-xlop-2023.209.0.0.28svn56910-53.1.noarch.rpm"
RPM_HASH = "ef719f38669c3c37299470a6de8f550a7c322a0f742a0b719ebe7f57ac400b5466935a5f84cf3c5e57181617f9687b791ae3f0ffa32768d06d0148de50dcadf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xlop.sty \
tex-xlop.tex \
texlive-xlop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
