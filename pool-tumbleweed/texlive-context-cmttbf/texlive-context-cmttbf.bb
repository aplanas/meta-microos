SUMMARY = "Use Computer Modern Typewriter bold font in ConTeXt"
DESCRIPTION = "The module makes provision for bold typewriter CM fonts, in \
ConTeXt. Such a font may be found in the Computer Modern 'extra \
bold' font set."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-cmttbf-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "ed5cca8879d36522774071282d89a82c86d84ee251ab514581e498b9c10fc88a02e7b4ab61b113f21d955bd98700fc9155ea35812eb3127b6ea7b3a7e9d067dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-cmttbf.tex \
texlive-context-cmttbf"

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
