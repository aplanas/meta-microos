SUMMARY = "Generate a PK font from an Adobe Type 1 font"
DESCRIPTION = "Generates a PK file from an Adobe Type 1 font. PK fonts are (or \
used to be) valuable in enabling previewers to view documents \
generated that use Type 1 fonts. The program makes use of code \
donated to the X consortium by IBM."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-ps2pk-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "eb4bacc243b636fbd98cf23cbef11d1b42999cb10b0a4724f3f29a641dcce6e75ebaaeb60f5f99f26c6aeb314aaa0fcae024a315e6073de6768dfb927c70de6e"
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
