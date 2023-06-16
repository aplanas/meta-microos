SUMMARY = "Convert MusicXML to PMX and MusiXTeX"
DESCRIPTION = "This program translates MusicXML files to input suitable for \
PMX and MusiXTeX processing. This package supports Windows, \
MacOS and Linux systems."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn57972"

RPM_NAME = "texlive-xml2pmx-2023.201.svn57972-52.1.noarch.rpm"
RPM_HASH = "264d1f6cf812d3379cffba52b8499c6472a12d0fbede66a4db975ea302bb79186211f668530b78f39efe6c162fc8161238dd08770fd224afe5cbdcb88628b6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xml2pmx.1 \
texlive-xml2pmx"

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
texlive-scripts-bin \
texlive-xml2pmx-bin"

inherit rpm
