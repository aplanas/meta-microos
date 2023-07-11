SUMMARY = "Examples and more from Guide to LaTeX, by Kopka and Daly"
DESCRIPTION = "The guide-to-latex package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45712"

RPM_NAME = "texlive-guide-to-latex-2023.201.svn45712-53.2.noarch.rpm"
RPM_HASH = "6e9944f1d6cc9e37633b75f93cede0c23ac285846d2d8e8e4646314f2e218b27a08bf8d13168f3d4ca7d8ad40937a92409f1f7e4290b23cacd7fa7b953b5c4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guide-to-latex"

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
