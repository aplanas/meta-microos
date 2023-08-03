SUMMARY = "Typeset a curriculum vitae"
DESCRIPTION = "Currvita is a package rather than a class (like most other \
curriculum vitae offerings). The author considers that a \
curriculum vitae can quite reasonably form part of another \
document (such as a letter, or a dissertation)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-currvita-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "c10f2ecf6810856f5af36f0788c527689b57fd920544b38b1e1ce7e724584b08a61de23c6d8eb2f0e2b9197467aeb040e0b6182dd2cb8d6fde4dae2d976e30be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-currvita.sty \
texlive-currvita"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
