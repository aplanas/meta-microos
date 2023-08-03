SUMMARY = "Convert MusicXML to PMX and MusiXTeX"
DESCRIPTION = "This program translates MusicXML files to input suitable for \
PMX and MusiXTeX processing. This package supports Windows, \
MacOS and Linux systems."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn57972"

RPM_NAME = "texlive-xml2pmx-2023.209.svn57972-53.1.noarch.rpm"
RPM_HASH = "deb214f74a6adbe17a4bed004a7ca6831f95066ea74135a27a3671317beaa0bde431ee39f83edee6364b20952ebe651e2e46d27f2c24a10c6b15685ee2960129"
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
