SUMMARY = "Display short quotations"
DESCRIPTION = "The package determines (on the basis of the width of the text \
of the epigram, laid out on a single line) whether to produce a \
line or a displayed paragraph."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20513"

RPM_NAME = "texlive-epigram-2023.201.svn20513-53.2.noarch.rpm"
RPM_HASH = "1a337cd6bb0ce1961559a92acae98fb0e2d3fc1ae78229602c7cb52a3134f27a99b79aaf863f136fd849abf8b474ccb54f600f5d5efd3f3751fb3e21f37f46d2"
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
