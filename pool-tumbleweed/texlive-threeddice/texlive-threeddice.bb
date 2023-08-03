SUMMARY = "Create images of dice with one, two, or three faces showing, using MetaPost"
DESCRIPTION = "The package provides MetaPost code to create all possible \
symmetrical views (up to rotation) of a right-handed die. \
Configuration is possible by editing the source code, following \
the guidance in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20675"

RPM_NAME = "texlive-threeddice-2023.209.1.0svn20675-55.1.noarch.rpm"
RPM_HASH = "400b6f89098dc56f536d7ad6bf67c185f1d685cb3005f024ec8d81b1e7782bfc39c41bddf14e0c6fdef1e597821644eaf00adbebebbbc89aff506ab31d0f8c7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeddice"

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
