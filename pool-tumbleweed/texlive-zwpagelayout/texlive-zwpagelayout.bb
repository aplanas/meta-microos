SUMMARY = "Page layout and crop-marks"
DESCRIPTION = "This package was developed as a typographers' toolbox offering \
important basic features for everyday work. It allows setting \
the paper size and the page layout; it can print crop marks; \
and it can reflect pages both horizontally and vertically. The \
package facilities work with TeX (output via dvips or \
(x)dvipdfm(x)), and with pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-2023.201.1.4esvn63074-52.2.noarch.rpm"
RPM_HASH = "4cddd14c9d691fe4e312ee4cb570369828a877190e8c8af110a6582a3f399a75bb9016e04255544d7900b146feeb05cff971ea082b11d645f0dd3031613e34d3"
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
