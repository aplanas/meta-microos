SUMMARY = "A symbol loader"
DESCRIPTION = "The name is by way of being an acronym for 'Yet Another Grand \
Unified Symbols Loader'... The package allows the user to \
access a symbol without loading the package that usually \
provides it; this has the advantage of avoiding the name \
clashes that so commonly trouble those who load \
symbol-packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29803"

RPM_NAME = "texlive-yagusylo-2023.209.1.2svn29803-53.1.noarch.rpm"
RPM_HASH = "5e52f841b7cf5286764da49c4354a4445077fc9c3ebf96fc6b49e41ce9bb8fa26bd66a768fc4bfb7c682a301cd3ad4de11f32e7df555c2f4a4bfb3b603466298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yagusylo.cfg \
tex-yagusylo.sty \
texlive-yagusylo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-suffix.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
