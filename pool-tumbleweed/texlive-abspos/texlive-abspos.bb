SUMMARY = "Absolute placement with coffins"
DESCRIPTION = "This package lets you place contents at an absolute position, \
anchored at some specified part of the contents, similar to how \
TikZ nodes work, though without using the two-pass strategy of \
TikZ. It also avoids messing with the order of beamer overlays, \
which is what happens when one uses the textpos package with \
the overlay option. The solution used is quite straightforward, \
combining coffins (using l3coffins) with the placement \
mechanisms of atbegshi."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn64465"

RPM_NAME = "texlive-abspos-2023.209.0.0.1svn64465-55.1.noarch.rpm"
RPM_HASH = "e7e9ab63adea21aeee09a1d036d37441106cc9020c12af1dfc44669a326ff7f7fac900ae675f57e98cbee7a7580f84406a89deac9d7772a93e7cc00c3d2640d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abspos.sty \
texlive-abspos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
