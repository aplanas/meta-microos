SUMMARY = "Save name of the footnote mark for reuse"
DESCRIPTION = "Sometimes the same footnote applies to more than one location \
in a table. With this package the mark of a footnote can be \
saved into a name, and re-used subsequently without creating \
another footnote at the bottom."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-savefnmark-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "d4aa0488f74dc415732312a3f61a79d7a089ad6e9236de17af60df64431febee3c70e506c57111f889f673c916504b6c51537a6fff6c286c70b39f7bfeb5005b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(savefnmark.sty) \
texlive-savefnmark"

RDEPENDS:${PN} += "/bin/sh \
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
