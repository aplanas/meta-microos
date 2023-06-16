SUMMARY = "A short introduction to LaTeX installation written in Chinese"
DESCRIPTION = "This package will introduce the operations related to \
installing TeX Live (introducing MacTeX in macOS), upgrading \
macro packages, and compiling simple documents on Windows 10, \
Ubuntu 20.04, and macOS systems, and mainly introducing command \
line operations."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023.1.1svn65434"

RPM_NAME = "texlive-install-latex-guide-zh-cn-2023.201.2023.1.1svn65434-52.1.noarch.rpm"
RPM_HASH = "d5424c8c750f38db6b8c0ccc4b758e2e111dac5ac1247b87054680d5ebf8f2894e34be085b1c3cba61e1a76a4283b715d72b7619c7e40d2b3d913d34cbc6958f"
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
