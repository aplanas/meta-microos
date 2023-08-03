SUMMARY = "Warn whenever a float is placed 'to far away'"
DESCRIPTION = "The package checks for floats that are placed too far from \
their origin. It was motivated by a question on the question \
and answer page."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27473"

RPM_NAME = "texlive-chkfloat-2023.209.0.0.1svn27473-54.1.noarch.rpm"
RPM_HASH = "27c7f666f39a1c562c803821f7fdc1c11f54ab09b40e973dcd0702e84dfb4b3826da2db246cbc315270f8b40e608775093946d3c9f2af52c8eb6236f4165ad7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chkfloat.sty \
texlive-chkfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
