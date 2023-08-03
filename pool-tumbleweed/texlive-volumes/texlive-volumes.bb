SUMMARY = "Typeset only parts of a document, with complete indexes etcetera"
DESCRIPTION = "This package helps you if you want to produce separate printed \
volumes from one LaTeX document, as well as one comprehensive, \
'all-inclusive' version. It suppresses the part of the table of \
contents that are not typeset, while counters, definitions, \
index entries etc. are kept consistent throughout the input \
file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-volumes-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "6e7284c867b3ffa9768d781678c61ead8e54f6d0697521f0e2e94eb00ace07511d38e6ba9aa4631c56fdf2a019c345c9afaa0beb6b9f8f7211c1f04fc2a244d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nowtoaux.sty \
tex-volumes.sty \
texlive-volumes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
