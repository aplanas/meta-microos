SUMMARY = "A utility for editing DVI files"
DESCRIPTION = "A Python script to support changing or creating DVI files via \
disassembling into text, editing, and then reassembling into \
binary format. It supports advanced features such as adding a \
preprint number or watermarks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64430"

RPM_NAME = "texlive-dviasm-2023.201.svn64430-53.2.noarch.rpm"
RPM_HASH = "51aa0727043ccdd77eda0fe5817c8abeb61871fc1a762a6d4835bc5c7e7c8ea964af580a6775c98c30d2765bb36049fdecf01f5fe253cc3216edfc089969d138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviasm"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dviasm-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
