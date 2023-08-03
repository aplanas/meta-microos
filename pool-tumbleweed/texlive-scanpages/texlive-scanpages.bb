SUMMARY = "Support importing and embellishing scanned documents"
DESCRIPTION = "The bundle provides support for the process of creating \
documents based on pre-TeX-era material that is available as \
scanned pages, only."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05asvn42633"

RPM_NAME = "texlive-scanpages-2023.209.1.05asvn42633-54.1.noarch.rpm"
RPM_HASH = "100cd8d609f9e495de0613d13001b00b1fea0dedea810be258f14fafd89a4698f51fcc0b093b54bafbdcf7cf72e5d8898ba176300689409c7f792f1df0c05c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scanpages.map \
tex-scanpages.sty \
tex-scanwipe.tfm \
tex-uscanwipe.fd \
texlive-scanpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fp-basic.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-pgffor.sty \
tex-updmap.cfg \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scanpages-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
