SUMMARY = "Typesetting programs and algorithms"
DESCRIPTION = "The main offering is a program environment; a programbox \
environment is available for fragments that must not break with \
the pages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.3.14svn44214"

RPM_NAME = "texlive-program-2023.201.3.3.14svn44214-52.1.noarch.rpm"
RPM_HASH = "836b7b3c4be440c2c546527d3096598d3b1a4d73afdf661aa10ffc98016ffc749be43a91ecd0556fc18878c1a7021ad604a6411dcbcfccc71645809e4b17a701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-program.sty \
texlive-program"

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
