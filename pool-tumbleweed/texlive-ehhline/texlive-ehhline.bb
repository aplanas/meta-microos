SUMMARY = "Extend the \\hhline command"
DESCRIPTION = "This package extends the \\hhline command with a !{...} token, \
which allows to create lines with arbitrary LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54676"

RPM_NAME = "texlive-ehhline-2023.201.1.1svn54676-53.2.noarch.rpm"
RPM_HASH = "b630b1ef21cc4ad1a55601ae7984ec8f93be1d09b17a41a6e5ad5de34d22e83324aab562b92aae223c7b5bb7eeebcaa5fd0dace746286c37d8ace19e8fe862f6"
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
