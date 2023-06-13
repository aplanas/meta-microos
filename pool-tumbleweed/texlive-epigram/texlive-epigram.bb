SUMMARY = "Display short quotations"
DESCRIPTION = "The package determines (on the basis of the width of the text \
of the epigram, laid out on a single line) whether to produce a \
line or a displayed paragraph."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20513"

RPM_NAME = "texlive-epigram-2023.201.svn20513-53.1.noarch.rpm"
RPM_HASH = "8fa7498dee631c3880b598e3389b8ab7c448c16be7f062e8794c51d0e28259955f7b75bf43973a73b3ec8dc4b7f0c2f8f510373808a4339ea6870112f918f010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(epigram.tex) \
texlive-epigram"

RDEPENDS:${PN} += "/bin/sh \
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
