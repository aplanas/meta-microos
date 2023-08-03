SUMMARY = "Typeset dichotomous identification keys"
DESCRIPTION = "This is a LaTeX package for typesetting dichotomous \
identification key in indented style. It can be considered as \
an extended version of package dichokey, as edichokey is more \
capable of dealing with complex keys."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-2023.209.2.01ysvn56223-54.1.noarch.rpm"
RPM_HASH = "d78040560caf849f898bed5c52c44d47620f956c2a3023357f244761017a42e328b57b9c704ee7372cfdda260dfc6348bfc7abcd7fdba63508f25d6f58085c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edichokey.sty \
texlive-edichokey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
