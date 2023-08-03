SUMMARY = "Remove excess space at left and right of tabular"
DESCRIPTION = "The tabular environment is changed so that the outer \
\\tabcolseps are compensated and a \\hline has the same length as \
the text. No @{} is needed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn17885"

RPM_NAME = "texlive-tabularborder-2023.209.1.0asvn17885-55.1.noarch.rpm"
RPM_HASH = "ff970c6517608f497fa84e560d7b455f08ca7cd99142e8fcccaafe19680a998dc8b7530f04c18405037faca87c110d27889c71dc3b15910a897f87e38f8cfa8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularborder.sty \
texlive-tabularborder"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
