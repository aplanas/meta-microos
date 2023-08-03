SUMMARY = "A utility for editing DVI files"
DESCRIPTION = "A Python script to support changing or creating DVI files via \
disassembling into text, editing, and then reassembling into \
binary format. It supports advanced features such as adding a \
preprint number or watermarks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64430"

RPM_NAME = "texlive-dviasm-2023.209.svn64430-54.1.noarch.rpm"
RPM_HASH = "37edbeb1525544f66454ee264e569daecceae27bea3e1217e7b10cf39087588e177dd899b0f3c720cce797928f6e81760ce30b66282424004cef38cb78fb791b"
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
