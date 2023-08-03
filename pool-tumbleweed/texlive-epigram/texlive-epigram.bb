SUMMARY = "Display short quotations"
DESCRIPTION = "The package determines (on the basis of the width of the text \
of the epigram, laid out on a single line) whether to produce a \
line or a displayed paragraph."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20513"

RPM_NAME = "texlive-epigram-2023.209.svn20513-54.1.noarch.rpm"
RPM_HASH = "2eb37b219f1c8c1ca937bc314f9c968e97d95fa6eb899a6efc79de88575935137639f9af550fdca92bee9bc9dd39f9a894ec0c780ee18c5574cf0b255e4cbf6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epigram.tex \
texlive-epigram"

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
texlive-scripts-bin"

inherit rpm
