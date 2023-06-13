SUMMARY = "Examples and more from Guide to LaTeX, by Kopka and Daly"
DESCRIPTION = "The guide-to-latex package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45712"

RPM_NAME = "texlive-guide-to-latex-2023.201.svn45712-53.1.noarch.rpm"
RPM_HASH = "0930f03a23271dec80c08cfe814c667d90ad3e480556c59dd1683f558e555a866f86ce32794c3ac5045ee261f711e8c02bd948c9a5832ae20e6a1ad7dbd4c7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guide-to-latex"

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
