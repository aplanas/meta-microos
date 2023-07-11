SUMMARY = "Convert MusicXML to PMX and MusiXTeX"
DESCRIPTION = "This program translates MusicXML files to input suitable for \
PMX and MusiXTeX processing. This package supports Windows, \
MacOS and Linux systems."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn57972"

RPM_NAME = "texlive-xml2pmx-2023.201.svn57972-52.2.noarch.rpm"
RPM_HASH = "c30ab60230a252edf94ddbc53685ecb22badd36a045f8417510837d00eb6836db8f4305dafe981595bfad330b3af7cba8cd4ddcaeac72fa57b8d7a016b5b3df1"
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
