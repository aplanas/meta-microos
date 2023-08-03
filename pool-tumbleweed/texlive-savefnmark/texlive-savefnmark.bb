SUMMARY = "Save name of the footnote mark for reuse"
DESCRIPTION = "Sometimes the same footnote applies to more than one location \
in a table. With this package the mark of a footnote can be \
saved into a name, and re-used subsequently without creating \
another footnote at the bottom."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-savefnmark-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "c07a4e531813806738515099bf6b0bc0d786a0a81ad08c74ca8e1eee887e6ee690a4b7e9c249dfb9b7070ed8f6bfc538643a64872b01ba519aed1231891a3a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-savefnmark.sty \
texlive-savefnmark"

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
