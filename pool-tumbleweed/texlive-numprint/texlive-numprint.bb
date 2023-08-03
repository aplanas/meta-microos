SUMMARY = "Print numbers with separators and exponent if necessary"
DESCRIPTION = "The package numprint prints numbers with a separator every \
three digits and converts numbers given as 12345.6e789 to \
12\\,345,6\\cdot 10^{789}. Numbers are printed in the current \
mode (text or math) in order to use the correct font. Many \
things, including the decimal sign, the thousand separator, as \
well as the product sign can be changed by the user, e.g., to \
reach 12,345.6\\times 10^{789}. If an optional argument is given \
it is printed upright as unit. Numbers can be rounded to a \
given number of digits. The package supports an automatic, \
language-dependent change of the number format. Tabular \
alignment using the tabular(*), array, tabularx, and longtable \
environments (similar to the dcolumn and rccol packages) is \
supported using all features of numprint. Additional text can \
be added before and after the formatted number."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.39svn27498"

RPM_NAME = "texlive-numprint-2023.209.1.39svn27498-55.1.noarch.rpm"
RPM_HASH = "cd0b7102577e2e3c81e68200ad73b7a0b7a4449b5f953085f61f63eb2986bcb500af57070e23260d120e905ecec637d587fa34bb99319435ed32ee855d98ab9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nbaseprt.sty \
tex-numprint.sty \
tex-numprint032.sty \
texlive-numprint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
