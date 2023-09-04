SUMMARY = "Running PSTricks under XeTeX"
DESCRIPTION = "The package provides an indirection scheme for XeTeX to use the \
pstricks xdvipdfmx.cfg configuration file, so that XeTeX \
documents will load it in preference to the standard \
pstricks.con configuration file. With this configuration, many \
PSTricks features can be used in XeLaTeX or plain XeTeX \
documents."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17055"

RPM_NAME = "texlive-xetex-pstricks-2023.209.svn17055-53.2.noarch.rpm"
RPM_HASH = "ec79cef5b2b11713176c06ef9b7d96fe5090c842eff483aad7c40f8847935f62aa02b3c402c07ffcf209047725f0128dc13c77a9ecd3ddcc571bd3fe3fe93ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks"

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
