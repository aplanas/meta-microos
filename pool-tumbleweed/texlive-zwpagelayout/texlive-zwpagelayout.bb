SUMMARY = "Page layout and crop-marks"
DESCRIPTION = "This package was developed as a typographers' toolbox offering \
important basic features for everyday work. It allows setting \
the paper size and the page layout; it can print crop marks; \
and it can reflect pages both horizontally and vertically. The \
package facilities work with TeX (output via dvips or \
(x)dvipdfm(x)), and with pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-2023.209.1.4esvn63074-53.2.noarch.rpm"
RPM_HASH = "43f8df6ac8a061ad5b419c471c706bc60b5fd697ba9132ac1759ddc277138765016fa38607bc5f3a9a561f4a6a4e1ed56968efaa51ce2fffdd4a702c412d3abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zwpagelayout.sty \
texlive-zwpagelayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-kvoptions.sty \
tex-luatex85.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
