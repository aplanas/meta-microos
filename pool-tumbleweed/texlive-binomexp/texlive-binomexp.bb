SUMMARY = "Calculate Pascal's triangle"
DESCRIPTION = "The package calculates and prints rows of Pascal's triangle. It \
may be used: simply to print successive rows of the triangle, \
or to print the rows inside an array or tabular."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-binomexp-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "9a6916422545194146740ce98e80acec514ff9aadf6b0f5bb57b9ca6a1ee04766cd6a1f6b91678e980d6c8b3b86205fee0f4362eef72fa56a86f4d288610cd01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(binomexp.sty) \
texlive-binomexp"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
