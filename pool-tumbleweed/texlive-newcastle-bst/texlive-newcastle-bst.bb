SUMMARY = "A BibTeX style to format reference lists in the Harvard at Newcastle style"
DESCRIPTION = "This package provides a BibTeX style to format reference lists \
in the Harvard at Newcastle style recommended by Newcastle \
University. It should be used alongside natbib for citations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62856"

RPM_NAME = "texlive-newcastle-bst-2023.209.1.1svn62856-55.1.noarch.rpm"
RPM_HASH = "06fcba84ec3c234a28707995838428aece5f2c225a94e6e41fcd7b88c21df9878bbe4946996f735111c75aa55bcd41e9571746b9e2a7df970ee73c7b43dc0734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcastle-bst"

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
