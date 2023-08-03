SUMMARY = "Typeset laboratory journals"
DESCRIPTION = "This class is designed to typeset laboratory journals that \
contain chronologically ordered records about experiments. From \
the sectioning commands, an experiment index is generated. The \
class is based on the KOMA-Script class scrbook.cls. There can \
be several index entries for one experiment."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-labbook-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "0796e898b66f8d42a84ef2d874e8b78d4c69cff6437fab3ed261a42724c46c6c722571c4804cf0c6b864a71d9ee24125d34e39c13bc58683f87b3d9d640fa0a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labbook.cls \
texlive-labbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
tex-scrbook.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
