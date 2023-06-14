SUMMARY = "Page layout and crop-marks"
DESCRIPTION = "This package was developed as a typographers' toolbox offering \
important basic features for everyday work. It allows setting \
the paper size and the page layout; it can print crop marks; \
and it can reflect pages both horizontally and vertically. The \
package facilities work with TeX (output via dvips or \
(x)dvipdfm(x)), and with pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-2023.201.1.4esvn63074-52.1.noarch.rpm"
RPM_HASH = "fefa31693c26947c124291f7b779b6256e49732b02eb99838e995520eff38a360230f6aa1c760066023998d9220606533e5b5675c8e21462289e092e540f7922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zwpagelayout.sty \
texlive-zwpagelayout"

RDEPENDS:${PN} += "/bin/sh \
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
