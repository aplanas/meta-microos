SUMMARY = "Insert pictures into paragraphs"
DESCRIPTION = "A legacy package for creating 'windows' in paragraphs, for \
inserting graphics, etc. (including 'dropped capitals'). Users \
should note that Pieter van Oostrum (in a published review of \
packages of this sort) does not recommend this package; Picins \
is recommended instead."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn65097"

RPM_NAME = "texlive-picinpar-2023.201.1.3svn65097-51.1.noarch.rpm"
RPM_HASH = "409d190c0779aac60a10b6f4739d50478cd8ff08d6dbb7ad6be7b006aa3debc42d6f0e493ed9d20593090f121942bf1216352c262bdcf90985862a825b9948d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-picinpar.sty \
texlive-picinpar"

RDEPENDS:${PN} += "/bin/sh \
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
