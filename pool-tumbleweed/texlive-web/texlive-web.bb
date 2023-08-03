SUMMARY = "The original literate programming system"
DESCRIPTION = "The system processes 'web' files in two ways: firstly to \
rearrange them to produce compilable code (using the program \
tangle), and secondly to produce a TeX source (using the \
program weave) that may be typeset for comfortable reading."
LICENSE = "SUSE-TeX"

PV = "2023.209.4.5svn66186"

RPM_NAME = "texlive-web-2023.209.4.5svn66186-54.1.noarch.rpm"
RPM_HASH = "26d924441c6d38c4e42f9068e30ae2041423d0b9a91926c530416fd9455e68afc6c13f2d9a48695da31f91cfcc6ea4a1dd7a323163dd240e56d52d4949a11451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tangle.1 \
man-weave.1 \
texlive-web"

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
texlive-scripts-bin \
texlive-web-bin"

inherit rpm
