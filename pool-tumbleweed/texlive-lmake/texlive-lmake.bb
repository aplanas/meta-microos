SUMMARY = "Process lists to do repetitive actions"
DESCRIPTION = "The package provides commands to simplify processing of \
sequential list-like structures, such as making a series of \
'similar' commands from a list of names."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25552"

RPM_NAME = "texlive-lmake-2023.209.1.0svn25552-55.1.noarch.rpm"
RPM_HASH = "f518804b8856923a94670a32b52071bda63e04bf743442cebdd43b34d8f3dea99b36ac20cd36ddec32978476592d5088adf23015146dce05cfee81973aea58dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lmake.sty \
texlive-lmake"

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
