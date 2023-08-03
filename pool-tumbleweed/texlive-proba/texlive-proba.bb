SUMMARY = "Shortcuts commands to symbols used in probability texts"
DESCRIPTION = "This package includes some of the most often used commands in \
probability texts, e.g. probability, expectation, variance, \
etc. It also includes some short commands for set (blackboard) \
or filtrations (calligraphic). It requires LaTeX2e and the \
amsfonts package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-proba-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "eb5486c8b93a575ffbd87cfdba7564fccfc70e8a7386404b4d1bf9934400e696ed5c37285f06c5bc66b32564474d965ce88f3f79765bc60e0e6d4fc46d706ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proba.sty \
texlive-proba"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
