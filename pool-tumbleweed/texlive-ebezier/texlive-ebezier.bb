SUMMARY = "Device independent picture environment enhancement"
DESCRIPTION = "Ebezier is a device independent extension for the standard \
picture environment. Linear, quadratic, and cubic bezier curves \
are supplied in connection with higher level circle drawing \
commands. Additionally some macros for the calculation of curve \
lenghts are part of this package."
LICENSE = "LPPL-1.0"

PV = "2023.201.4svn15878"

RPM_NAME = "texlive-ebezier-2023.201.4svn15878-53.1.noarch.rpm"
RPM_HASH = "67f51f784df9613e3c65210746f988f688e348469145d3e3ce23724fbcb9dc840b8feede632788e92a84f7d5e102df343393e1ef6ad607dd913e9e62a0fd86ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ebezier.sty) \
texlive-ebezier"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
