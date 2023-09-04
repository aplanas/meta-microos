SUMMARY = "A utility for editing DVI files"
DESCRIPTION = "A Python script to support changing or creating DVI files via \
disassembling into text, editing, and then reassembling into \
binary format. It supports advanced features such as adding a \
preprint number or watermarks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64430"

RPM_NAME = "texlive-dviasm-2023.209.svn64430-54.2.noarch.rpm"
RPM_HASH = "ea72fade5438218f2014914dd6c27fca0bc88ae2aa76949a4c2035e3d1252ef82f30cba5906b5062d7c3dffbd8068a396e37bbb4e094d9c3b9677946f6f31b63"
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
