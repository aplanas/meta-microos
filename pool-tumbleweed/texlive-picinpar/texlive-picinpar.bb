SUMMARY = "Insert pictures into paragraphs"
DESCRIPTION = "A legacy package for creating 'windows' in paragraphs, for \
inserting graphics, etc. (including 'dropped capitals'). Users \
should note that Pieter van Oostrum (in a published review of \
packages of this sort) does not recommend this package; Picins \
is recommended instead."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn65097"

RPM_NAME = "texlive-picinpar-2023.209.1.3svn65097-52.1.noarch.rpm"
RPM_HASH = "94c799391cc0b30d27746c75dc0db8d461d1bd2ddc628a8eff956868cc9c5eba901c25454996b624b211fda1471f8a65ce08a22a02e3d3346e86fb8c0f8eb9c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-picinpar.sty \
texlive-picinpar"

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
