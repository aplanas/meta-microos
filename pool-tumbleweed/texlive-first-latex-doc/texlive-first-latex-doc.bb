SUMMARY = "A document for absolute LaTeX beginners"
DESCRIPTION = "The document leads a reader, who knows nothing about LaTeX, \
through the production of a two page document. The user who has \
completed that first document, and wants to carry on, will find \
recommendations for tutorials."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-first-latex-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "6756e9b1c51f91738e456ea4651886bbba8b617b36480cae72467fbea2523bd048ff94a8dd5287048d9cfb1496036b2aac1b536324f3b82497cc090f5bcbead9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-first-latex-doc"

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
