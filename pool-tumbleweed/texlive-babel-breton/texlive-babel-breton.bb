SUMMARY = "Babel contributed support for Breton"
DESCRIPTION = "Breton (being, principally, a spoken language) does not have \
typographic rules of its own; this package provides an \
'appropriate' selection of French and British typographic \
rules."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn30257"

RPM_NAME = "texlive-babel-breton-2023.209.1.0hsvn30257-54.1.noarch.rpm"
RPM_HASH = "d22356e468c10d7bb75c3a83b623bc5fc334123e8572ed3f4d8f7af92a5ae36263192acfab0cb07379764e050e01fb43f18f711a3f67a26a7b29d5b6f9c8b925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breton.ldf \
texlive-babel-breton"

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
