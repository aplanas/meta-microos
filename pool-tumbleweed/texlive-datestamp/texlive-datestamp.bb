SUMMARY = "Fixed date-stamps with LuaLaTeX"
DESCRIPTION = "Add fixed date-stamps with simple and customizable aux files \
and LuaLaTeX. As long as the aux file is not deleted/modified \
the date-stamp generated with this package remains intact."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-datestamp-2023.209.0.0.3svn61719-55.1.noarch.rpm"
RPM_HASH = "ed53eef7adaf440ea23cbb46b256c4e471e95e344266f86edffb98c0fd409d65955ec093363c92a25b3b15e22b5d1d98b68e009b784d1fe4c96799f5efad7ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datestamp.sty \
texlive-datestamp"

RDEPENDS:${PN} += "/usr/bin/sh \
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
