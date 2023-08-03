SUMMARY = "Estonian language module for glossaries package"
DESCRIPTION = "This package provides the Estonian language module for the \
glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-2023.209.1.0svn49928-54.1.noarch.rpm"
RPM_HASH = "e17f7a3d7b54a9243875a1fbc3747d1f8b565adf8aa48e1fb723c8df7f61652f51b7d66f3a90c687c605ea0fed16e72f526cd40788e74aa7b798cbac313fac1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-estonian-ascii.ldf \
tex-glossaries-estonian-utf8.ldf \
tex-glossaries-estonian.ldf \
texlive-glossaries-estonian"

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
