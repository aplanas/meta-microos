SUMMARY = "Typeset anthologies of poetry"
DESCRIPTION = "The package is designed to aid in the management and formatting \
of anthologies of poetry and other writings; it does not \
concern itself with actually typesettinig the verse itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn39921"

RPM_NAME = "texlive-poetrytex-2023.209.3.0.1svn39921-53.1.noarch.rpm"
RPM_HASH = "d10e977ab854acbed3da8da772639ce43fef52b9ee7d441ef3de9528de1077f63b8d8ba5af4ef97bc8ffd16eb014a337bb7467e8ef9e91f33661e873dfe5dcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poetrytex.sty \
texlive-poetrytex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
