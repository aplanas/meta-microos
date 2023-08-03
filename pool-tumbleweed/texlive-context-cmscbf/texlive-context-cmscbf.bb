SUMMARY = "Use Computer Modern bold Caps and Small-caps in ConTeXt"
DESCRIPTION = "The module makes provision for bold caps and small caps CM \
fonts, in ConTeXt. Such a font may be found in the Computer \
Modern 'extra bold' font set."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-cmscbf-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "02530ad8da9d66c6d61fab5e3cb4504fdad35a469f0633eec64de531a8e102cb5380173a338994a0e3eaa94ee73c4bac1f4c88bef94c622d820f57d565baa94b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-cmscbf.tex \
texlive-context-cmscbf"

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
