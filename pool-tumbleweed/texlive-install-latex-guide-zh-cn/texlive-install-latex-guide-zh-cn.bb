SUMMARY = "A short introduction to LaTeX installation written in Chinese"
DESCRIPTION = "This package will introduce the operations related to \
installing TeX Live (introducing MacTeX in macOS), upgrading \
macro packages, and compiling simple documents on Windows 10, \
Ubuntu 20.04, and macOS systems, and mainly introducing command \
line operations."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023.1.1svn65434"

RPM_NAME = "texlive-install-latex-guide-zh-cn-2023.209.2023.1.1svn65434-54.1.noarch.rpm"
RPM_HASH = "5a488f75406a299a37dda3424d500289365c2f7a80d727fb3f9f416f15a0f1f60fbf463c51641174f97a0c62fbc216105310073617b70208a9d818ae092697c3"
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
