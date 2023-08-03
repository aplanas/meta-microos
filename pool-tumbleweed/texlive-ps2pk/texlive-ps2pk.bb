SUMMARY = "Generate a PK font from an Adobe Type 1 font"
DESCRIPTION = "Generates a PK file from an Adobe Type 1 font. PK fonts are (or \
used to be) valuable in enabling previewers to view documents \
generated that use Type 1 fonts. The program makes use of code \
donated to the X consortium by IBM."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-ps2pk-2023.209.svn66186-53.1.noarch.rpm"
RPM_HASH = "6c534cc65a11631ef64203cbba09e5823d1fa392f2e8eb00897be6ce374420d7024b90f56ff0dc482a7847218eeaa718e615497740a24573aea29f7e571dfa39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mag.1 \
man-pfb2pfa.1 \
man-pk2bm.1 \
man-ps2pk.1 \
texlive-ps2pk"

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
texlive-ps2pk-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
