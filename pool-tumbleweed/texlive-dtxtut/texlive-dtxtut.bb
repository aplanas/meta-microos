SUMMARY = "Tutorial on writing .dtx and .ins files"
DESCRIPTION = "This tutorial is intended for advanced LaTeX2e users who want \
to learn how to create .ins and .dtx files for distributing \
their homebrewed classes and package files."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn38375"

RPM_NAME = "texlive-dtxtut-2023.209.2.1svn38375-53.1.noarch.rpm"
RPM_HASH = "d2e5081dc0e92061072a2ccab8790b7550f6602de8fc66cef79142f863954dcd2d4bd61251c9f1ecdccd715169f6d57c7bd0726a2ab84260299f781f379e9a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxtut"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
