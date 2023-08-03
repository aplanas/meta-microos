SUMMARY = "Extend the \\hhline command"
DESCRIPTION = "This package extends the \\hhline command with a !{...} token, \
which allows to create lines with arbitrary LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54676"

RPM_NAME = "texlive-ehhline-2023.209.1.1svn54676-54.1.noarch.rpm"
RPM_HASH = "8a58b10b119d3d1828580008eac2485ec9c378b45ce20fe697ada1555470935189bccc19a81e5561efd0918384bb8d404e0fbc09db58c8658dccbda6491d9677"
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
