SUMMARY = "A symbol loader"
DESCRIPTION = "The name is by way of being an acronym for 'Yet Another Grand \
Unified Symbols Loader'... The package allows the user to \
access a symbol without loading the package that usually \
provides it; this has the advantage of avoiding the name \
clashes that so commonly trouble those who load \
symbol-packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29803"

RPM_NAME = "texlive-yagusylo-2023.209.1.2svn29803-53.2.noarch.rpm"
RPM_HASH = "fd1b1bb8edea3c0f886eac01216117715079f3e27a153a4580dec7c16ef4fb3f6aa6046435caea9ff7345948ebd73ecd4688aaf88c4359e8cadb88bde4eee81c"
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
