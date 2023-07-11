SUMMARY = "Typeset dichotomous identification keys"
DESCRIPTION = "This is a LaTeX package for typesetting dichotomous \
identification key in indented style. It can be considered as \
an extended version of package dichokey, as edichokey is more \
capable of dealing with complex keys."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-2023.201.2.01ysvn56223-53.2.noarch.rpm"
RPM_HASH = "ef2932e4ace9316d36789532990507c97f92de840cc23afc1bf674145a93476f61f999948aa30e7e04baf6c5ac62a9407c47e766d56b3b56e30b3040d5b8e78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edichokey.sty \
texlive-edichokey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
