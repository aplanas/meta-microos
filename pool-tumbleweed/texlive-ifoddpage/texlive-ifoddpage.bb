SUMMARY = "Determine if the current page is odd or even"
DESCRIPTION = "The package provides an \\ifoddpage conditional to determine if \
the current page is odd or even. The macro \\checkoddpage must \
be used direct before to check the page number using a label. \
Two compiler runs are therefore required to achieve correct \
results. In addition, the conditional \\ifoddpageoronside is \
provided which is also true in oneside mode where all pages use \
the odd page layout."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn64967"

RPM_NAME = "texlive-ifoddpage-2023.208.1.2svn64967-53.1.noarch.rpm"
RPM_HASH = "8fe2e12a856fe19671373c678e121db2209b5d140b0440325b285eb9e56d31b9e3a55e7bbc53ff3efb23d29b292299b0805fa28eea134276528223eb0114585a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifoddpage.sty \
texlive-ifoddpage"

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
