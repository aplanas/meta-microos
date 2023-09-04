SUMMARY = "Extend the \\hhline command"
DESCRIPTION = "This package extends the \\hhline command with a !{...} token, \
which allows to create lines with arbitrary LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54676"

RPM_NAME = "texlive-ehhline-2023.209.1.1svn54676-54.2.noarch.rpm"
RPM_HASH = "c9a85e95c47ef0c979e76d1d72e0aaee957c0bf28dc45b862c816aa016a84f1797812b8b0b27536b27cddbabd5d0b744ddb37b8f2c392d35ea3350c75f144039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ehhline.sty \
texlive-ehhline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-hhline.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
