SUMMARY = "A programmable font test pattern generator"
DESCRIPTION = "The package implements all the font testing commands of Knuth's \
testfont.tex, but arranges that information necessary for each \
command is supplied as arguments to that command, rather than \
prompted for. This makes it possible to type all the tests in \
one command line, and easy to input the package in a file and \
to use the commands there. A few additional commands supporting \
this last purpose are also made available."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20638"

RPM_NAME = "texlive-fntproof-2023.209.svn20638-53.1.noarch.rpm"
RPM_HASH = "b637a0ee6c7ab71b958f653baa491c365c3d748579e9b52dd4c1d4ad6263c4827114ef52851321fd8233c1d0306e1c7b71e15a1a8f574c940d3628186a6cc53d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fntproof.tex \
texlive-fntproof"

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
