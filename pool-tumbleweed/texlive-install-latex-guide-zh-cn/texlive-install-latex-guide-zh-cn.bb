SUMMARY = "A short introduction to LaTeX installation written in Chinese"
DESCRIPTION = "This package will introduce the operations related to \
installing TeX Live (introducing MacTeX in macOS), upgrading \
macro packages, and compiling simple documents on Windows 10, \
Ubuntu 20.04, and macOS systems, and mainly introducing command \
line operations."
LICENSE = "LPPL-1.0"

PV = "2023.208.2023.1.1svn65434"

RPM_NAME = "texlive-install-latex-guide-zh-cn-2023.208.2023.1.1svn65434-53.1.noarch.rpm"
RPM_HASH = "9f2667ff961fc0946c6101a85c7ccf6071afe5040239bd45fd9297cd5925d979dc7859fb050b1cf16dc9dec517594524948db11fbdd76fc288526e23a09dd72e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-install-latex-guide-zh-cn"

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
