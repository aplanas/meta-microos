SUMMARY = "Determine if the current page is odd or even"
DESCRIPTION = "The package provides an \\ifoddpage conditional to determine if \
the current page is odd or even. The macro \\checkoddpage must \
be used direct before to check the page number using a label. \
Two compiler runs are therefore required to achieve correct \
results. In addition, the conditional \\ifoddpageoronside is \
provided which is also true in oneside mode where all pages use \
the odd page layout."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64967"

RPM_NAME = "texlive-ifoddpage-2023.201.1.2svn64967-52.1.noarch.rpm"
RPM_HASH = "5434bb12fb4345e1c6a6e8550d3074c9d3ea6750ca0d99c8178eac3e1ff9a0827190a4e3ccfe7edb20d98b21be3902c02c38546f239ccf8246bcea0fdb47c1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifoddpage.sty \
texlive-ifoddpage"

RDEPENDS:${PN} += "/bin/sh \
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
