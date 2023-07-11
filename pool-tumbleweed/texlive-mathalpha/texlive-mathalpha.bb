SUMMARY = "General package for loading maths alphabets in LaTeX"
DESCRIPTION = "Package mathalfa was renamed to mathalpha. For backward \
compatibility the old name will continue to be recognized in \
LaTeX documents. The package provides means of loading maths \
alphabets (such as are normally addressed via macros \\mathcal, \
\\mathbb, \\mathfrak and \\mathscr), offering various features \
normally missing in existing packages for this job."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.143svn61089"

RPM_NAME = "texlive-mathalpha-2023.208.1.143svn61089-53.1.noarch.rpm"
RPM_HASH = "7e0370435d38d40a7363e4b1826e6a70584bcf3cfc57ccc20c086f6fa28373cd0bdb9e689fc39340ccfda900bce838103f95ee3f9caffb3d94d548fa12fb0a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathalfa.sty \
tex-mathalpha.sty \
texlive-mathalpha"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bboldx.sty \
tex-dsserif.sty \
tex-tx-ds.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
