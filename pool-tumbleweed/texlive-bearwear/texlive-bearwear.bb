SUMMARY = "Shirts to dress TikZbears"
DESCRIPTION = "The package offers tools to create shirts for TikZbears from \
the TikZlings package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn54826"

RPM_NAME = "texlive-bearwear-2023.209.0.0.2svn54826-54.1.noarch.rpm"
RPM_HASH = "dab2588c778b54bdf307c7247c1bcdcc522ce18f1beb91d7cbcaf7d4b99d0088b05b7c0f52cb49f8d5e8d8f25164996bc25b7753926901986451ce2c2f3555b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bearwear.sty \
texlive-bearwear"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikzlings-bears.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
