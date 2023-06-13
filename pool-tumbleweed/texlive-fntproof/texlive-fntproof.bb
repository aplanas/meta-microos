SUMMARY = "A programmable font test pattern generator"
DESCRIPTION = "The package implements all the font testing commands of Knuth's \
testfont.tex, but arranges that information necessary for each \
command is supplied as arguments to that command, rather than \
prompted for. This makes it possible to type all the tests in \
one command line, and easy to input the package in a file and \
to use the commands there. A few additional commands supporting \
this last purpose are also made available."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20638"

RPM_NAME = "texlive-fntproof-2023.201.svn20638-52.1.noarch.rpm"
RPM_HASH = "ce0a3a7e704f235d1a1e001571cc660a2c0ca6dbc88fe6d4a5f5cab3549ea949bd6e85df5b377d21a04833f7f81ed10c064bdec2d9881287f145665d9c84f825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fntproof.tex) \
texlive-fntproof"

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
