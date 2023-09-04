SUMMARY = "Device independent picture environment enhancement"
DESCRIPTION = "Ebezier is a device independent extension for the standard \
picture environment. Linear, quadratic, and cubic bezier curves \
are supplied in connection with higher level circle drawing \
commands. Additionally some macros for the calculation of curve \
lenghts are part of this package."
LICENSE = "LPPL-1.0"

PV = "2023.209.4svn15878"

RPM_NAME = "texlive-ebezier-2023.209.4svn15878-54.2.noarch.rpm"
RPM_HASH = "f82f500f396e01620b2e5f44a8cfb34f54c34cb8f072e6e722c060d4740f125babf349b8a6139ddd73da4faa9462ab28f5b11f0dca7d11940c88b66fea183470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebezier.sty \
texlive-ebezier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
