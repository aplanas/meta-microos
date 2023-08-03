SUMMARY = "Produce bracketed identification keys"
DESCRIPTION = "The package provides an environment bracketkey for use when \
producing lists of species."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17129"

RPM_NAME = "texlive-bracketkey-2023.209.1.0svn17129-53.1.noarch.rpm"
RPM_HASH = "2e78d6501b77c999b5c6842739720a7b609538d3b4da269c340a93a0b34044355aa79c48d734199559e066eb2223b7b4e10d7da49701ea1674e309c28171b8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bracketkey.sty \
texlive-bracketkey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-coolstr.sty \
tex-hyperref.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
