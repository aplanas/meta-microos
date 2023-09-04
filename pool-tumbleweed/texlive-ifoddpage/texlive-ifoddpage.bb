SUMMARY = "Determine if the current page is odd or even"
DESCRIPTION = "The package provides an \\ifoddpage conditional to determine if \
the current page is odd or even. The macro \\checkoddpage must \
be used direct before to check the page number using a label. \
Two compiler runs are therefore required to achieve correct \
results. In addition, the conditional \\ifoddpageoronside is \
provided which is also true in oneside mode where all pages use \
the odd page layout."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64967"

RPM_NAME = "texlive-ifoddpage-2023.209.1.2svn64967-54.1.noarch.rpm"
RPM_HASH = "b2456f5f5042fd3c7755ec496c4242d9de43a11b7098800036a4f28d693bab4a1bdb23234f5ad2c806aa836d01a0466bcb33cd5a7639a28c34ef0eef89e2aef8"
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
