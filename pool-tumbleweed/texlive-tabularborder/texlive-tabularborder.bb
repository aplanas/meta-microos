SUMMARY = "Remove excess space at left and right of tabular"
DESCRIPTION = "The tabular environment is changed so that the outer \
\\tabcolseps are compensated and a \\hline has the same length as \
the text. No @{} is needed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn17885"

RPM_NAME = "texlive-tabularborder-2023.201.1.0asvn17885-54.1.noarch.rpm"
RPM_HASH = "c38a4732fbeebfc6ae808d6ef0513f69c0a59c9918736fc8f44ce910895dd58848c3ad5c8aa8236f5c1b795e5647e7871143a253cfcfc98f9a628b0c099ed193"
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
