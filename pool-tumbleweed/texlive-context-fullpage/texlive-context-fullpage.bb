SUMMARY = "Overfull pages with ConTeXt"
DESCRIPTION = "The (ConTeXt) module copies the functionality of the fullpage, \
and adds a styling parameter, given in the \\usemodule command"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-fullpage-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "792b7e0119d2f114d1e118162eb26058161c26c73fccd703a261445c5ed17699c11f083eb3bf00a97a77dd057fc14865e2807c6f3d76883f6ef022e4fff513da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fullpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
