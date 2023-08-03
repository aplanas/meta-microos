SUMMARY = "Babel support for Esperanto"
DESCRIPTION = "The package provides the language definition file for support \
of Esperanto in babel. Some shortcuts are defined, as well as \
translations to Esperanto of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4tsvn30265"

RPM_NAME = "texlive-babel-esperanto-2023.209.1.4tsvn30265-54.1.noarch.rpm"
RPM_HASH = "535911100cef252297d3682cdaace6537493c1701e1c980e43f2e9d92b69d4589e9de3746eb8c5663a989771ced9971f06dd00cdd5c2ab6bea9d30fe81ab1799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esperanto.ldf \
texlive-babel-esperanto"

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
