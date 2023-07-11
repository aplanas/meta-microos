SUMMARY = "Additional Lua functions for LuaTeX macro programmers"
DESCRIPTION = "Lualibs is a collection of Lua modules useful for general \
programming. The bundle is based on lua modules shipped with \
ConTeXt, and made available in this bundle for use independent \
of ConTeXt."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.75svn64615"

RPM_NAME = "texlive-lualibs-2023.208.2.75svn64615-53.1.noarch.rpm"
RPM_HASH = "41ae168c4335d74027dffd522da63ac836aced50696b76ea1baa8e63504f394ba0f62097661f0359985b26e6021b874fff7982c422e37b78ff5458baa0ab2899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualibs"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
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
