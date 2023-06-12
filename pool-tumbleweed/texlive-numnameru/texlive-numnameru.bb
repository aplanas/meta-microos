SUMMARY = "Converts a number to the russian spelled out name"
DESCRIPTION = "This package converts a numerical number to the russian spelled \
out name of the number. For example, 1 - odin, 2 - dva, 12 - \
dvenadtsat'."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44895"

RPM_NAME = "texlive-numnameru-2023.201.svn44895-54.1.noarch.rpm"
RPM_HASH = "79810e068758afdfbdff6d2365a930ef106c1a304ed741e4776e7f4831d68fda906a1e1f3bb7d6af9f90988c5d1e903937ffb078d269739c0fddde33787c7caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(numnameru.sty) \
texlive-numnameru"
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
