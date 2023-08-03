SUMMARY = "Underline text allowing line breaking"
DESCRIPTION = "Provides commands \\Underline, \\Midline and \\Overline for \
underlining, striking out, and overlining their text arguments."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19085"

RPM_NAME = "texlive-umoline-2023.209.svn19085-54.1.noarch.rpm"
RPM_HASH = "27669008136761488f06741a6bd874f7dde45779840fa1e82f62667275901e20ce9896b45ce570a7aa34e01a4bd9557a1cac8665883b19492866b2aed23981d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-umoline.sty \
texlive-umoline"

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
