SUMMARY = "Convert MusicXML to PMX and MusiXTeX"
DESCRIPTION = "This program translates MusicXML files to input suitable for \
PMX and MusiXTeX processing. This package supports Windows, \
MacOS and Linux systems."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn57972"

RPM_NAME = "texlive-xml2pmx-2023.209.svn57972-53.2.noarch.rpm"
RPM_HASH = "d994fbc8b8f43b201c9bc77fab89092dd5ff2f646f1631c1b566ccfacaf51c3af01b4274b95e21449adc5a5ebf52c5797054c9c380a2e610a3cb5b0a5c97b438"
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
