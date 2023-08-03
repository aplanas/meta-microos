SUMMARY = "Prefix references to bibliographies produced by bibtopic"
DESCRIPTION = "The package permits users to apply prefixes (fixed strings) to \
references to entries in bibliographies produced by the \
bibtopic package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn15878"

RPM_NAME = "texlive-bibtopicprefix-2023.209.1.10svn15878-54.1.noarch.rpm"
RPM_HASH = "d6f3a902ae1f82faf0207406a69ba118bb429bfb43b66ce504fa5f07bcea66734b252675472cd22df79c55e6b300a58986fbe71c9c3199b044d62bd3cbcb9e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibtopicprefix.sty \
texlive-bibtopicprefix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibtopic.sty \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
