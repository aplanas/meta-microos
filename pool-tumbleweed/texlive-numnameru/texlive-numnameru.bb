SUMMARY = "Converts a number to the russian spelled out name"
DESCRIPTION = "This package converts a numerical number to the russian spelled \
out name of the number. For example, 1 - odin, 2 - dva, 12 - \
dvenadtsat'."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44895"

RPM_NAME = "texlive-numnameru-2023.209.svn44895-55.1.noarch.rpm"
RPM_HASH = "81f64c57cfd72ec365c6747c0eba0c763184b34f30c20c96907c7cc1d1c33a1cd3587cbcab69c476a9bbf4ca666b2c59615aec1e4967cc0be81724ee1838bb0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numnameru.sty \
texlive-numnameru"

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
