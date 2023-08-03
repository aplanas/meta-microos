SUMMARY = "Typeset recipes"
DESCRIPTION = "Typeset recipes with the ingredients lined up with their method \
step (somewhat similarly to the layout used in cooking)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn34453"

RPM_NAME = "texlive-cuisine-2023.209.0.0.7svn34453-55.1.noarch.rpm"
RPM_HASH = "bd0ca4f4efbffa79e4607aa2b10fb91bd6be12d8dbddb1ffd437150e4ef010d4da5b0b24da29a4b5d4715002832e22ec2f22a6717df959682d561144d4fbd198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cuisine.sty \
texlive-cuisine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-nicefrac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
