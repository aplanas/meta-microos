SUMMARY = "Produce bracketed identification keys"
DESCRIPTION = "The package provides an environment bracketkey for use when \
producing lists of species."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17129"

RPM_NAME = "texlive-bracketkey-2023.201.1.0svn17129-52.1.noarch.rpm"
RPM_HASH = "9cdfac034b0168fc5607f62e3628210367350d985c547133c03dcb246f2a6a5df06b65eda05643b7a35c306174285f708f1c4a70c50149febe4209bb805d5fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bracketkey.sty \
texlive-bracketkey"

RDEPENDS:${PN} += "/bin/sh \
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
