SUMMARY = "Prefix references to bibliographies produced by bibtopic"
DESCRIPTION = "The package permits users to apply prefixes (fixed strings) to \
references to entries in bibliographies produced by the \
bibtopic package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn15878"

RPM_NAME = "texlive-bibtopicprefix-2023.201.1.10svn15878-53.1.noarch.rpm"
RPM_HASH = "ea27e9373a4deef5715def47e8bc4ff2db5bb98e6466cb1d49c046dcb22e71ab42a9d644c7f83941c8b51ca6eed4bc37ef4eaa3f8efd765b85dc18cb3b8e1076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibtopicprefix.sty \
texlive-bibtopicprefix"

RDEPENDS:${PN} += "/bin/sh \
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
