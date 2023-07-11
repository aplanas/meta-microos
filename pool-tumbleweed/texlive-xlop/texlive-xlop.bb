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

PV = "2023.201.0.0.28svn56910"

RPM_NAME = "texlive-xlop-2023.201.0.0.28svn56910-52.2.noarch.rpm"
RPM_HASH = "c2debd447d3f158a0432ba939a503c2e413be8898a0663d71193636338844e10f31745772817ae72e7bcb8cd2d2517c855fcf618c6f905d92c00accae5f813e4"
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
