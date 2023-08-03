SUMMARY = "Babel support for Czech"
DESCRIPTION = "The package provides the language definition file for support \
of Czech in babel. Some shortcuts are defined, as well as \
translations to Czech of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1asvn30261"

RPM_NAME = "texlive-babel-czech-2023.209.3.1asvn30261-54.1.noarch.rpm"
RPM_HASH = "3266505c1d2a18b673f343209d4b3e50e32efa39d250eeee2bf1b995ab39e7a0c6ed7598b89e84b0727736a3e76426c4fa42f77c22099a36d8eb30be5bc4a9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-czech.ldf \
texlive-babel-czech"

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
