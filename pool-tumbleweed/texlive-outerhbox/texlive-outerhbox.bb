SUMMARY = "Collect horizontal material for contributing to a paragraph"
DESCRIPTION = "The package provides the \\outerhbox command, which is similar \
to \\hbox, except that material is set in outer horizontal mode. \
This prevents TeX from optimising away maths penalties and the \
like, that are needed when the material is \\unhbox'ed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2svn54254"

RPM_NAME = "texlive-outerhbox-2023.209.1.2svn54254-55.1.noarch.rpm"
RPM_HASH = "415c43d0c09e9dcf895e4ece2a093d618a809f6a2c942255a044a91f419dd064c7d069b29ebe52b697ae2e0e8ac6971dc82de2aaf3dbbc2922fc1be3ec9213cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outerhbox.sty \
texlive-outerhbox"

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
