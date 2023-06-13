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

RPM_NAME = "texlive-xlop-2023.201.0.0.28svn56910-52.1.noarch.rpm"
RPM_HASH = "12500d6588184095898d666165f5bfd5b8137a73731c49c06c414362e6a6aaff9e741212e15a0ab3736a75dc8c07e7065a1f1d32f7b60012a0170bdaa163dfab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xlop.sty) \
tex(xlop.tex) \
texlive-xlop"

RDEPENDS:${PN} += "/bin/sh \
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
