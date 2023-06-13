SUMMARY = "Babel module to support Macedonian Cyrillic"
DESCRIPTION = "The package provides support for Macedonian documents written \
in Cyrillic, in babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn39587"

RPM_NAME = "texlive-babel-macedonian-2023.201.svn39587-53.1.noarch.rpm"
RPM_HASH = "ab3758046c408a8ea0ab041859d17faf93f58d4135ece359838919af5ce995ee1090a06c8245ce7bee47512bd6edb4ef5bcd6444742fe9150a9ddce00a3ff520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(macedonian.ldf) \
texlive-babel-macedonian"

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
