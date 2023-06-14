SUMMARY = "Fixed date-stamps with LuaLaTeX"
DESCRIPTION = "Add fixed date-stamps with simple and customizable aux files \
and LuaLaTeX. As long as the aux file is not deleted/modified \
the date-stamp generated with this package remains intact."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.0.0.3svn61719"

RPM_NAME = "texlive-datestamp-2023.204.0.0.3svn61719-54.1.noarch.rpm"
RPM_HASH = "61270af1eeccfc0fb7c11be3376a9fef5323fa97d6bda257b1e7fbdadac28cfb7eaeb62d7e921950bc38f153a03691b79ba8dddeffaa41bec8e78af8f94e7034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datestamp.sty \
texlive-datestamp"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
