SUMMARY = "Sympathetically spaced ellipsis after punctuation"
DESCRIPTION = "The package provides commands that give a well-spaced ellipsis \
after !, ?, !? or ?!."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22931"

RPM_NAME = "texlive-eqell-2023.209.svn22931-54.2.noarch.rpm"
RPM_HASH = "539026ff8e945e61a656672a2ea0a12602f2684ceddbd78f58f44398cea95922c90692f3b973eaaf209ead9df3f40a933a05069ff050539e9a8d44b9a78c4c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqell.sty \
texlive-eqell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
