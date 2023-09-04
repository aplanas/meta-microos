SUMMARY = "Pointing hand font"
DESCRIPTION = "Provides right- and left-pointing hands in both black-on-white \
and white-on-black realisation. The font is distributed as \
Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn13293"

RPM_NAME = "texlive-hands-2023.209.svn13293-54.2.noarch.rpm"
RPM_HASH = "a701a247379a95c9da8c5263b939344cf069fd98dd81899ea331f1272a4f67267796d1639acc916dd99fb01df44d4d65d357a7b818c8c3d360545b2c2e9717c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hands.tfm \
texlive-hands"

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
