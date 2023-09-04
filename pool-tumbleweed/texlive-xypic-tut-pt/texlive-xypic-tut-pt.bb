SUMMARY = "A tutorial for XY-pic, in Portuguese"
DESCRIPTION = "The xypic-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-xypic-tut-pt-2023.209.svn15878-53.2.noarch.rpm"
RPM_HASH = "ac56ecbd9d162fe509b35eb2ce461425d82b26501498bbf920fd15b123aa4259b8f078535b2ad9b38c471083d14dbaa31135fe38a6bac6c4efb5be070e1f89a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xypic-tut-pt"

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
