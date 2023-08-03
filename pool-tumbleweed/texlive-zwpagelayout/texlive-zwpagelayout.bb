SUMMARY = "Page layout and crop-marks"
DESCRIPTION = "This package was developed as a typographers' toolbox offering \
important basic features for everyday work. It allows setting \
the paper size and the page layout; it can print crop marks; \
and it can reflect pages both horizontally and vertically. The \
package facilities work with TeX (output via dvips or \
(x)dvipdfm(x)), and with pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-2023.209.1.4esvn63074-53.1.noarch.rpm"
RPM_HASH = "3a18f38520839eed6e7aa4bfd360b847e1ec4a865d5863c8baee1baa265b993271f1a9329a655cf5cdde0934198b54da10cbadc20a11256ddc8804adb72bc142"
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
