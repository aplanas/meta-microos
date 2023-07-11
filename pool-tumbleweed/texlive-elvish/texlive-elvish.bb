SUMMARY = "Fonts for typesetting Tolkien Elvish scripts"
DESCRIPTION = "The bundle provides fonts for Cirth (cirth.mf, etc.) and for \
Tengwar (teng10.mf). The Tengwar fonts are supported by macros \
in teng.tex, or by the (better documented) tengtex package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-elvish-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "5197c5a61f2683e83f7ce679d30101cd70f04db77c7daaf157f6902281090a8105d8c6115484e491b71abcd9b6ae7a7c3508eef43e13d575eac5ab633635e104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cirth.tfm \
tex-teng10.tfm \
texlive-elvish"

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
