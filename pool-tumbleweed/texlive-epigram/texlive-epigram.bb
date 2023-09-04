SUMMARY = "Display short quotations"
DESCRIPTION = "The package determines (on the basis of the width of the text \
of the epigram, laid out on a single line) whether to produce a \
line or a displayed paragraph."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20513"

RPM_NAME = "texlive-epigram-2023.209.svn20513-54.2.noarch.rpm"
RPM_HASH = "97a2e979b39a6928418664fdbec490021dbdacefa7e242ca163caafb460569b3e85b265bdcd47aa6917b2138f35b5e3fe278bb74369646b9669c098bc69238c3"
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
