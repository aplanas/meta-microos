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

RPM_NAME = "texlive-xlop-2023.209.0.0.28svn56910-53.2.noarch.rpm"
RPM_HASH = "1b14bc33e5ee01f40ffdf234c3a5d0333a6b437879ed5a580085c31ba3b8727125e80909f6b5058a82bfe2207d4002e1e15ccafd2f3766711c703d08ec27b732"
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
